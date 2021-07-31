package org.example.demoservice.controller;

import org.example.demoservice.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenbin
 * @date 2021/7/24
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Value("${configName}")
    private String configName;

    @Value("${configPassword}")
    private String configPassword;

    @RequestMapping("/test")
    @ResponseBody
    public Map<String,String> test() {
        Map map = new HashMap();
        map.put("configName",configName);
        map.put("configPassword",configPassword);
        return map;
    }

    @Autowired
    private DemoService demoService;

    @RequestMapping("/dubbo")
    public String testService() {
        return demoService.getValue();
    }
}
