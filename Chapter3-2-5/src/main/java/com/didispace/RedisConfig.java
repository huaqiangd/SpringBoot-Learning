package com.didispace;

import com.didispace.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author 程序猿DD
 * @version 1.0.0
 * @date 16/4/15 下午3:19.
 * @blog http://blog.didispace.com
 */
@Configuration
public class RedisConfig {

//    @Bean
//    JedisConnectionFactory jedisConnectionFactory() {
//        return new JedisConnectionFactory();
//    }

    @Bean
    public RedisTemplate<String, User> redisTemplate(JedisConnectionFactory factory) {
        RedisTemplate<String, User> template = new RedisTemplate<>();
//        template.setConnectionFactory(jedisConnectionFactory());
        template.setConnectionFactory(factory);
        template.setKeySerializer(new StringRedisSerializer());
        template.setValueSerializer(new RedisObjectSerializer());
        return template;
    }


}
