package com.person.booklease.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author:chenyiwu
 * @Describtion:
 * @Create Time:2018/7/24
 */
@Data
@Slf4j
public class RedisConfig {
   /* @Value("${spring.redis.host}")
    private String host;

    @Value("${spring.redis.port}")
    private int port;

    @Value("${spring.redis.timeout}")
    private int timeout;

    @Value("${spring.redis.jedis.pool.max-idle}")
    private int maxIdle;

    @Value("${spring.redis.jedis.pool.max-wait}")
    private long maxWaitMillis;

    @Value("${spring.redis.jedis.pool.max-active}")
    private long maxActive;

    @Value("${spring.redis.password}")
    private String password;

    private int numTestsPerEvictionRun = 3;

    private long timeBetweenEvictionRunsMillis = 30000;

    private long minEvictableIdleTimeMillis = 300000;

    private int maxTotal = 1000;

    *//**
     * JedisPoolConfig 连接池
     *
     * @return
     *//*
    @Bean
    public JedisPoolConfig jedisPoolConfig() {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        // 最大空闲数
        jedisPoolConfig.setMaxIdle(maxIdle);
        // 连接池的最大数据库连接数
        jedisPoolConfig.setMaxTotal(maxTotal);
        // 最大建立连接等待时间
        jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);
        // 逐出连接的最小空闲时间 默认1800000毫秒(30分钟)
        jedisPoolConfig.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        // 每次逐出检查时 逐出的最大数目 如果为负数就是 : 1/abs(n), 默认3
        jedisPoolConfig.setNumTestsPerEvictionRun(numTestsPerEvictionRun);
        // 逐出扫描的时间间隔(毫秒) 如果为负数,则不运行逐出线程, 默认-1
        jedisPoolConfig.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        // 是否在从池中取出连接前进行检验,如果检验失败,则从池中去除连接并尝试取出另一个
        jedisPoolConfig.setTestOnBorrow(true);
        // 在空闲时检查有效性, 默认false
        jedisPoolConfig.setTestWhileIdle(true);
        return jedisPoolConfig;
    }

    *//**
     * 单机版配置
     *
     * @param @param  jedisPoolConfig
     * @param @return
     * @return JedisConnectionFactory
     * @throws
     * @Title: JedisConnectionFactory
     * @autor lpl
     * @date 2018年2月24日
     *//*
    @Bean
    public JedisConnectionFactory JedisConnectionFactory(JedisPoolConfig jedisPoolConfig) {
        JedisConnectionFactory JedisConnectionFactory = new JedisConnectionFactory(jedisPoolConfig);
        //连接池
        JedisConnectionFactory.setPoolConfig(jedisPoolConfig);
        //IP地址
        JedisConnectionFactory.setHostName(host);
        //端口号
        JedisConnectionFactory.setPort(port);
        //如果Redis设置有密码
        JedisConnectionFactory.setPassword(password);
        //客户端超时时间单位是毫秒
        JedisConnectionFactory.setTimeout(timeout);
        log.info("JedisPool注入成功！！");
        log.info("redis地址：" + host + ":" + port);
        return JedisConnectionFactory;
    }

    *//**
     * 实例化 RedisTemplate 对象
     *
     * @return
     *//*
    @Bean
    public RedisTemplate<String, Object> functionDomainRedisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        initDomainRedisTemplate(redisTemplate, redisConnectionFactory);
        return redisTemplate;
    }

    *//**
     * 设置数据存入 redis 的序列化方式,并开启事务
     *
     * @param redisTemplate
     * @param factory
     *//*
    private void initDomainRedisTemplate(RedisTemplate<String, Object> redisTemplate, RedisConnectionFactory factory) {
        //如果不配置Serializer，那么存储的时候缺省使用String，如果用User类型存储，那么会提示错误User can't cast to String！
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());
        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        // 开启事务
        redisTemplate.setEnableTransactionSupport(true);
        redisTemplate.setConnectionFactory(factory);
    }

    *//**
     * 注入封装RedisTemplate
     *
     * @return RedisUtil
     * @throws
     * @Title: redisUtil
     * @autor lpl
     * @date 2017年12月21日
     *//*
    @Bean(name = "redisUtil")
    public RedisUtil redisUtil(RedisTemplate<String, Object> redisTemplate) {
        RedisUtil redisUtil = new RedisUtil();
        redisUtil.setRedisTemplate(redisTemplate);
        return redisUtil;
    }*/
}
