package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author User
 * @version: V1.0
 */
@Component
public class MyCommon {

    private String value;

    public String getValue() {
        return "你好asdfasdf";
    }

    public void setValue(String value) {
        this.value = value;
    }
}
