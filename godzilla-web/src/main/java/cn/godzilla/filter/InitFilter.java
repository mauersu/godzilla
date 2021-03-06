package cn.godzilla.filter;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.web.context.support.WebApplicationContextUtils;

import cn.godzilla.model.Project;
import cn.godzilla.service.ProjectService;
import cn.godzilla.util.GodzillaWebApplication;

/**
 * 初始化
 * 1.各个项目部署锁初始化
 */
public class InitFilter extends GodzillaWebApplication implements Filter {

	private ProjectService projectService;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		//logger.info("InitFilter init部署锁");
		context = filterConfig.getServletContext();
		applicationContext = WebApplicationContextUtils.getWebApplicationContext(context);
		projectService = (ProjectService)applicationContext.getBean("projectService");
		List<Project> projects = projectService.queryAll(SERVER_USER, TEST_PROFILE);
		for(Project pro: projects) {
			deploy_lock.put(pro.getProjectCode(), new ReentrantLock());
		}
		deploy_lock.put(QUASIPRODUCT_PROFILE, new ReentrantLock(true));
		deploy_lock.put(PRODUCT_PROFILE, new ReentrantLock(true));
		
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		chain.doFilter(request, response);
	}
	
	
	@Override
	public void destroy() {
	}

}
