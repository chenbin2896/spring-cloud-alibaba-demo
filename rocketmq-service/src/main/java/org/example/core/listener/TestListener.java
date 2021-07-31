package org.example.core.listener;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @author chenbin
 * @date 2021/8/1
 */
@RocketMQMessageListener(
        topic = "test222",
        consumerGroup = "test_my-consumer",
        selectorExpression = "*")
@Component
public class TestListener implements RocketMQListener<String> {

    @Override
    public void onMessage(String user) {
        System.out.println("收到消息：" + user);
    }
}

