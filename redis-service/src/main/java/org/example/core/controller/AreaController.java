package org.example.core.controller;

import com.test.common.Result;
import org.example.core.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author chenbin
 * @date 2021/7/31
 */
@RestController
public class AreaController {

    @Resource
    private DemoService demoService;

    @GetMapping("/area/{id}")
    public Result findAreaById(@PathVariable("id") Long id) {
        return demoService.findAreaById(id);
    }
}
