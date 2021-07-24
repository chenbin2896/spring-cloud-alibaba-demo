package org.example.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author chenbin
 * @date 2021/7/24
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private LoadBalancerClient loadBalancerClient;

    @Resource
    private RestTemplate restTemplate;

    @Value("${spring.application.name}")
    private String appName;

    @Value("${valueForNacos}")
    private String valueForNacos;

    @RequestMapping("/test")
    public String test() {

        System.out.println(valueForNacos);
        ServiceInstance serviceInstance = loadBalancerClient.choose("demo-service");
        String path = String.format("http://%s:%s/%s",serviceInstance.getHost(),serviceInstance.getPort(),"demo/test");
        String forObject = restTemplate.getForObject(path, String.class);
        return "consumer"+forObject;
    }


}
