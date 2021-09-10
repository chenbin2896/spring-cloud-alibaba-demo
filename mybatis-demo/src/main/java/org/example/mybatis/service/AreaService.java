package org.example.mybatis.service;

import org.example.mybatis.entity.Area;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Area)表服务接口
 *
 * @author makejava
 * @since 2021-09-10 22:07:17
 */
public interface AreaService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Area queryById(Long id);

    /**
     * 分页查询
     *
     * @param area        筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<Area> queryByPage(Area area, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param area 实例对象
     * @return 实例对象
     */
    Area insert(Area area);

    /**
     * 修改数据
     *
     * @param area 实例对象
     * @return 实例对象
     */
    Area update(Area area);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
