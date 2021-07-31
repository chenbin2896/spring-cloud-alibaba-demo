package org.example.core;

import org.example.core.config.MySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @author chenbin
 * @date 2021/7/31
 */
@SpringBootApplication
@EnableBinding({MySource.class})
public class RocketMqApplication {

    public static void main(String[] args) {
        SpringApplication.run(RocketMqApplication.class);
    }
}
