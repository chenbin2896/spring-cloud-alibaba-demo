package org.example.core.config;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author chenbin
 * @date 2021/7/31
 */
public interface MySource {
    @Output("output1")
    MessageChannel output1();

    @Output("output2")
    MessageChannel output2();
}
