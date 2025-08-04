package com.example.springinmemcache.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class RedisService {
    @Autowired
    private RedisTemplate redisTemplate;

    public String get(String key)
    {
        try {
            Object o = redisTemplate.opsForValue().get(key);
            /*ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(o.toString(),entityClass);*/
            return o.toString();
        } catch (Exception e) {
            System.out.println("Error in reading cache data "+e);
            return null;
        }
    }

    public void set(String key,Object o,Long ttl)
    {
        redisTemplate.opsForValue().set(key,o,ttl, TimeUnit.SECONDS);
    }
}
