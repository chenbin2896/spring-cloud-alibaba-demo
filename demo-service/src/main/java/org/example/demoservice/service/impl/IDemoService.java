package org.example.demoservice.service.impl;

import org.example.demoservice.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @author chenbin
 * @date 2021/7/26
 */
@Service
public class IDemoService implements DemoService {
    @Override
    public String  getValue() {
        return "你好dubbo";
    }
}
