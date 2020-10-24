package com.test.demo;

import com.test.MyCommon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author User
 * @version: V1.0
 */
@SpringBootApplication
@RestController
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }



    @RequestMapping("/index")
    public String index() {
        MyCommon myCommon = new MyCommon();
        String value = myCommon.getValue();
        return value+"23423";
    }
}
