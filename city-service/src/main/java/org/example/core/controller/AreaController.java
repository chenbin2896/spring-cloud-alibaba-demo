package org.example.core.controller;

import org.example.core.dao.EmployeeMapper;
import org.example.core.pojo.Area;
import org.example.core.pojo.Employees;
import org.example.core.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author chenbin
 * @date 2021/7/31
 */
@RestController
@RequestMapping("/area")
public class AreaController{

    @Autowired
    private AreaService areaService;

    @Resource
    private EmployeeMapper employeeMapper;

    /**
     * 查询全部数据
     *
     * @return
     *//*
    @GetMapping()
    public Result<List<Area>> findAll() {
        return new SuccessResult(areaService.findAll());
    }*/

    /**
     * 根据ID查询5
     *
     * @param id ID
     * @return
     */
    @GetMapping(value = "/{id}")
    public Map<String,Object> findById(@PathVariable Long id) {
        Area area = new Area();
        area.setAreaCode("xxx");
        Map<String,Object> map = new HashMap<>();
        map.put("hello","你好");
        map.put("area",area);

        Employees byId = employeeMapper.findById(1L);
        System.out.println(Objects.isNull(byId));
        return map;

    }

}
