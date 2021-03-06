package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author fukq
 */
@Configuration
public class RedisConfig {

//
//    @Autowired
//    public RedisConnectionFactory redisConnectionFactory;
//
//
//
//    /**
//     * 实例化 RedisTemplate 对象
//     *
//     * @return RedisTemplate
//     */
//    @Bean
//    public RedisTemplate<String, Object> functionDomainRedisTemplate() {
//        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
//        initDomainRedisTemplate(redisTemplate, redisConnectionFactory);
//        return redisTemplate;
//    }
//
//    /**
//     * 设置数据存入 redis 的序列化方式
//     *
//     * @param redisTemplate redisTemplate
//     * @param factory factory
//     */
//    private void initDomainRedisTemplate(
//            RedisTemplate<String, Object> redisTemplate, RedisConnectionFactory factory) {
//        redisTemplate.setKeySerializer(new StringRedisSerializer());
//        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
//        redisTemplate.setHashValueSerializer(new JdkSerializationRedisSerializer());
//        redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
//        redisTemplate.setConnectionFactory(factory);
//    }
//


}
