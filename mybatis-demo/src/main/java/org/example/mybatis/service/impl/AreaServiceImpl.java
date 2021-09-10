package org.example.mybatis.service.impl;

import org.example.mybatis.dao.AreaDao;
import org.example.mybatis.entity.Area;
import org.example.mybatis.service.AreaService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Area)表服务实现类
 *
 * @author makejava
 * @since 2021-09-10 22:07:17
 */
@Service("areaService")
public class AreaServiceImpl implements AreaService {
    @Resource
    private AreaDao areaDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Area queryById(Long id) {
        return this.areaDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param area        筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<Area> queryByPage(Area area, PageRequest pageRequest) {
        long total = this.areaDao.count(area);
        return new PageImpl<>(this.areaDao.queryAllByLimit(area, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param area 实例对象
     * @return 实例对象
     */
    @Override
    public Area insert(Area area) {
        this.areaDao.insert(area);
        return area;
    }

    /**
     * 修改数据
     *
     * @param area 实例对象
     * @return 实例对象
     */
    @Override
    public Area update(Area area) {
        this.areaDao.update(area);
        return this.queryById(area.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.areaDao.deleteById(id) > 0;
    }
}
