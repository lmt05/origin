package lmt.com.reids;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisDemo {

    private final static Logger logger = LoggerFactory.getLogger(RedisDemo.class);
    private Jedis jedisCli;
    private static JedisPool pool; //线程池对象

    private static String ADDR = "127.0.0.1"; 	//redis所在服务器地址（案例中是在本机）
    private static int PORT = 6379; 		//端口号
    private static String AUTH = "";		//密码（我没有设置）
    private static int MAX_IDLE = 10;		//连接池最大空闲连接数（最多保持空闲连接有多少）
    private static int MAX_ACTIVE = 50;		//最大激活连接数（能用的最多的连接有多少）
    private static int MAX_WAIT = 100000;		//等待可用连接的最大时间(毫秒)，默认值-1，表示永不超时。若超过等待时间，则抛JedisConnectionException
    private static int TIMEOUT = 10000;		//链接连接池的超时时间#使用连接时，检测连接是否成功
    private static boolean TEST_ON_BORROW = true;	//使用连接时，测试连接是否可用

    static{
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxIdle(MAX_IDLE);
        pool = new JedisPool(config, ADDR, PORT, TIMEOUT); //新建连接池，如有密码最后加参数
    }
}
