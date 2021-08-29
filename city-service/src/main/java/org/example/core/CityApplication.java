package org.example.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author chenbin
 * @date 2021/7/31
 */
@SpringBootApplication
@MapperScan("org.example.core.dao")
public class CityApplication {
    public static void main(String[] args) {
        SpringApplication.run(CityApplication.class);
    }
}
