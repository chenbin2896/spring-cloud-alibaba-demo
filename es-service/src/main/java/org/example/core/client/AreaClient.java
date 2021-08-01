package org.example.core.client;

import com.test.common.Result;
import org.example.core.pojo.Area;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author chenbin
 * @date 2021/8/1
 */
@FeignClient("city-service")
@Component
public interface AreaClient {

    @RequestMapping("/area")
    Result<List<Area>> findAll();
}
