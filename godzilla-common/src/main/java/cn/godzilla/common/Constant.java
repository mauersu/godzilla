package cn.godzilla.common;

public interface Constant {
	
	public final int TRUE = 1;
	public final int FALSE = 0 ;
	
	public final String VERSION_PARENTPOM = "1.0.1-SNAPSHOT";
	
	public int RPC_DEFAULT_PORT = 8855;
	public final String SUCCESS = "SUCCESS";
	public final String FAILURE = "FAILURE";
	public final String AUDITOR_TEXT = "审核通过";
	
	public final String NOTYET_VERIFY_STATUS = "0";//未审核
	public final String OK_VERIFY_STATUS = "1";//审核通过
	public final String STOP_VERIFY_STATUS = "2";//未通过
	public final String PROJECT_ENV = "dev";
	public final String SHELL_SERVER_PATH = "/home/godzilla/gzl/shell/server";
	public final String SHELL_CLIENT_PATH = "/home/godzilla/gzl/shell/client";
	/**
	 * freemarker ftl url base path
	 */
	public final String BASE_PATH = "godzilla-web";
	
	
	public final String TEST_PROFILE = "TEST";
	public final String QUASIPRODUCT_PROFILE = "QUASIPRODUCT";
	public final String PRODUCT_PROFILE = "PRODUCT";
	/**
	 * echo default value
	 */
	public final int DEFAULT_WEBSOCKET_PORT = 9999;
	public final String DEFAULT_MQ_PRODUCER_NAME = "godzilla-producer";
	public final String DEFAULT_MQ_CONSUMER_NAME = "godzilla-consumer";
	public final String DEFAULT_MQ_NAMESRV_ADDR = "10.100.142.65:9876";
	public final String DEFAULT_MQ_TOPIC = "godzilla";
	/**
	 * rpc default value
	 */
	public final String DEFAULT_POM_BASEPATH = "/home/godzilla/gzl/work/godzilla";
	
	/**
	 * echo KEY NAME 
	 */
	public final String WEBSOCKET_PORT_KEY = "websocket.port";
	public final String MQ_PRODUCER_NAME_KEY = "rocketmq.producer.name";
	public final String MQ_CONSUMER_NAME_KEY = "rocketmq.consumer.name";
	public final String MQ_NAMESRV_ADDR_KEY = "rocketmq.nameserver.address";
	public final String MQ_TOPIC_KEY = "rocketmq.topic";
	
	/**
	 * rpc KEY NAME 
	 */
	public final String POM_BASEPATH_KEY = "rpc.pom.basepath";
	
	
	public final static String PROFILE_TEST = "test";
	public final static String PROFILE_PRO_DEPLOY = "pro_deploy";
	public final static String PROFILE_ONLINE = "online" ;

	public final static String NO_AJAX = "100000";
	public final static String NULL_NAMEPASSWORD = "100001";
	public final static String NOTEXIST_USER = "100002";
	public final static String WRONG_PASSWORD = "100003";
	public final static String UNKNOW_ERROR = "100004";
	public final static String NO_LOGIN = "100005";
	public final static String NO_ADDUPDATEPROP = "100011";
	public final static String NO_VERIFYPROP = "100012";
	public final static String NO_AUTHORITY = "100013";
	public final static String NO_MVNDEPLOY = "100014";
	public final static String NO_CHANGEPOM = "100015";
	public final static String NO_RPCFACTORY = "100016";
	public final static String NO_AUTHORIZATION = "100017";
	public final static String NO_ADDUSER = "100019";
	public final static String NO_SAMEPASSWORD = "100019";
	public final static String NO_UPDATEFUNRIGHT = "100020";
	public final static String NO_CHANGECOMMIT = "100021";
	public final static String NO_SVNCOMMIT = "100022";
	public final static String NO_FOUNDCONFLICT = "100023";
	public final static String NO_CLIENTPARAM = "100024";
	public final static String NO_SERVERPARAM = "100025";
	public final static String NO_JAVASHELLCALL = "100026";
	public final static String NO_SVNVERSION = "100027";
	
	public final static String OK_AJAX = "200000";
	public final static String OK_CHECKUSER = "200001";
	public final static String OK_LOGIN = "200002";
	public final static String OK_ADDUPDATEPROP = "200011";
	public final static String OK_VERIFYPROP = "200012";
	public final static String OK_MVNDEPLOY = "200014";
	public final static String OK_AUTHORIZATION = "200017";
	public final static String OK_ADDUSER = "200018";
	public final static String OK_UPDATEFUNRIGHT = "200020";
	public final static String OK_SVNCOMMIT = "200021";
	public final static String OK_SVNVERSION = "200027";
	
}
