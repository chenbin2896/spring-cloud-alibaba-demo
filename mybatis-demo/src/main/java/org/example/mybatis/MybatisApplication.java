package org.example.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author chenbin
 * @date 2021/9/10
 */
@SpringBootApplication
@MapperScan("org.example.mybatis.dao")
public class MybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class);
    }
}
