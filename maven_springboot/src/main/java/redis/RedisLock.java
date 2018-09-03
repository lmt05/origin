package redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

import java.util.List;
import java.util.UUID;

public class RedisLock {

    public String getLock(String key,int timout){

        try {
            Jedis jedis =RedisManager.getJedis();
            String value = UUID.randomUUID().toString();
            long end = System.currentTimeMillis() + timout;
            while (System.currentTimeMillis()<end) {
                if (jedis.setnx(key, value) == 1) {
                    return value;
                }
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean releaseLock(String key,String vule){
        try {
            Jedis jedis = RedisManager.getJedis();

            while (true){
                jedis.watch(key);
            if(vule.equals(jedis.get(key))){//判断当前拿到的是同一个锁
                Transaction multi = jedis.multi();
                multi.del(key);
                List<Object> exec = multi.exec();
                if(exec==null){
                    continue;
                }
                return true;
            }
            jedis.unwatch();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        RedisLock redisLock = new RedisLock();
        String aaa = redisLock.getLock("aaa", 10000);
        if(null!=aaa){
            System.out.println("获得锁成功");
        }

        String aaa1 = redisLock.getLock("aaa", 10000);
        System.out.println(aaa1);

    }
}
