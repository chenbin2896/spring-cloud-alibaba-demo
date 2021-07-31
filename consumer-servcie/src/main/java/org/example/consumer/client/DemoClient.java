package org.example.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenbin
 * @date 2021/7/26
 */
@FeignClient("demo-service")
public interface DemoClient {

    @RequestMapping("/demo/dubbo")
    String getValue();
}
