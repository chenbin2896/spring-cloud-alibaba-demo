package org.example.core.service;

import com.test.common.Result;
import org.example.core.annotation.RedisCache;
import org.example.core.client.AreaClient;
import org.example.core.util.RedisUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author chenbin
 * @date 2021/7/31
 */
@Service
public class DemoService {

    @Resource
    private AreaClient areaClient;


    @RedisCache
    public Result findAreaById(Long id) {
        return areaClient.findById(id);
    }
}

