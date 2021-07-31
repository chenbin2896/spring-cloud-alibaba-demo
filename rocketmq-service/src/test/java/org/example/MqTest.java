package org.example;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.example.core.RocketMqApplication;
import org.example.core.service.SenderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

/**
 * @author chenbin
 * @date 2021/8/1
 */
@SpringBootTest(classes = RocketMqApplication.class)
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class MqTest {

    @Resource
    private SenderService service;

    @Resource
    private RocketMQTemplate rocketMQTemplate;

    @Test
    public void test() {

//        service.send("nihao helll");

        rocketMQTemplate.convertAndSend("test222",":234");
    }



}
