package org.example.mybatis.controller;

import org.example.mybatis.entity.Area;
import org.example.mybatis.service.AreaService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Area)表控制层
 *
 * @author makejava
 * @since 2021-09-10 22:07:15
 */
@RestController
@RequestMapping("area")
public class AreaController {
    /**
     * 服务对象
     */
    @Resource
    private AreaService areaService;

    /**
     * 分页查询
     *
     * @param area        筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Area>> queryByPage(Area area, PageRequest pageRequest) {
        return ResponseEntity.ok(this.areaService.queryByPage(area, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Area> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.areaService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param area 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Area> add(Area area) {
        return ResponseEntity.ok(this.areaService.insert(area));
    }

    /**
     * 编辑数据
     *
     * @param area 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Area> edit(Area area) {
        return ResponseEntity.ok(this.areaService.update(area));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.areaService.deleteById(id));
    }

}

