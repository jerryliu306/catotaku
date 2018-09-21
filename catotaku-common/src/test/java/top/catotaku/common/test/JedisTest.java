//package top.catotaku.common.test;
//
//        import org.junit.Test;
//        import org.junit.runner.RunWith;
//        import org.springframework.beans.factory.annotation.Autowired;
//        import org.springframework.test.context.ContextConfiguration;
//        import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//        import redis.clients.jedis.*;
//        import top.catotaku.common.jedis.JedisClient;
//        import top.catotaku.common.jedis.JedisClientCluster;
//
//        import java.io.IOException;
//        import java.util.HashSet;
//        import java.util.Set;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({"classpath:spring-jedis.xml"})
//public class JedisTest {
//
//    @Autowired
//    private JedisClient jedisClient;
//
//    @Test
//    public void testJedis1(){
//        Jedis jedis = new Jedis("106.12.99.8",6379);
//        jedis.auth("qaz113300!");
//        String str1 = jedis.set("qq", "cyd");
//        String str2 = jedis.get("qq");
//        System.out.println(str1);
//        System.out.println(str2);
//        jedis.close();
//    }
//
//    @Test
//    public void testJedis2(){
//        JedisPool jedisPool = new JedisPool("106.12.99.8",6379);
//        Jedis jedis = jedisPool.getResource();
//        jedis.auth("qaz113300!");
//        System.out.println(jedis.get("name"));
//        jedis.close();
//        jedisPool.close();
//    }
//    @Test
//    public void testJedis3() throws IOException {
//        Set<HostAndPort> nodes = new HashSet<>();
//        nodes.add(new HostAndPort("121.43.168.127", 7001));
//        nodes.add(new HostAndPort("121.43.168.127", 7002));
//        nodes.add(new HostAndPort("121.43.168.127", 7003));
//        nodes.add(new HostAndPort("121.43.168.127", 7004));
//        nodes.add(new HostAndPort("121.43.168.127", 7005));
//        nodes.add(new HostAndPort("121.43.168.127", 7006));
//        JedisCluster jedisCluster = new JedisCluster(nodes);
//        jedisCluster.set("qwer", "1234");
//        System.out.println(jedisCluster.get("qwer"));
//        jedisCluster.close();
//    }
//
//
//    @Test
//    public void testJedis4() throws IOException {
//        //jedisClient.hset("hashtt", "sss","stt");//超时
//        //jedisClient.hset("qqqq", "qq", "123");y
//        //jedisClient.set("qw", "fff");
//        System.out.println(jedisClient.get("hash2"));
//        System.out.println(jedisClient.hget("ggg", "sss"));
//    }
//}
