package org.example.core.controller;

import com.test.common.Result;
import com.test.common.SuccessResult;
import org.example.core.pojo.Area;
import org.example.core.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chenbin
 * @date 2021/7/31
 */
@RestController
@RequestMapping("/area")
public class AreaController {

    @Autowired
    private AreaService areaService;


    /**
     * 查询全部数据
     *
     * @return
     */
    @GetMapping()
    public Result<List<Area>> findAll() {
        return new SuccessResult(areaService.findAll());
    }

    /**
     * 根据ID查询5
     *
     * @param id ID
     * @return
     */
    @GetMapping(value = "/{id}")
    public Result findById(@PathVariable Long id) {
        return new SuccessResult(areaService.findById(id));
    }

}
