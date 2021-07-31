package org.example.core.client;

import com.test.common.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenbin
 * @date 2021/7/31
 */
@Component
@FeignClient("city-service")
public interface AreaClient {

    @RequestMapping("/area/{id}")
    Result findById(@PathVariable("id") Long id);
}
