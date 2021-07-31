package org.example.core.controller;

import com.test.common.PageResult;
import com.test.common.Result;
import org.example.core.pojo.Area;
import org.example.core.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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
    public Result findAll() {
        return Result.SUCCESS("查询成功", areaService.findAll());
    }

    /**
     * 根据ID查询
     *
     * @param id ID
     * @return
     */
    @GetMapping(value = "/{id}")
    public Result findById(@PathVariable Long id) {
        return Result.SUCCESS("查询成功", areaService.findById(id));
    }


    /**
     * 分页+多条件查询
     *
     * @param searchMap 查询条件封装
     * @param page      页码
     * @param size      页大小
     * @return 分页结果
     */
    @PostMapping(value = "/search/{page}/{size}")
    public Result findSearch(@RequestBody Map searchMap, @PathVariable int page, @PathVariable int size) {
        Page<Area> pageList = areaService.findSearch(searchMap, page, size);
        return Result.SUCCESS("查询成功", new PageResult<Area>(pageList.getTotalElements(), pageList.getContent()));
    }

    /**
     * 根据条件查询
     *
     * @param searchMap
     * @return
     */
    @PostMapping(value = "/search")
    public Result findSearch(@RequestBody Map searchMap) {
        return Result.SUCCESS("查询成功", areaService.findSearch(searchMap));
    }

    /**
     * 增加
     *
     * @param Area
     */
    @PostMapping()
    public Result save(@RequestBody Area Area) {
        areaService.save(Area);
        return Result.SUCCESS("添加成功");
    }


    /**
     * 删除
     *
     * @param id
     */
    @DeleteMapping(value = "/{id}")
    public Result delete(@PathVariable Long id) {
        areaService.deleteById(id);
        return Result.SUCCESS("删除成功");
    }
}
