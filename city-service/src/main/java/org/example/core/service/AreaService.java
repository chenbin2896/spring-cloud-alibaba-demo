package org.example.core.service;

import org.example.core.dao.AreaDao;
import org.example.core.pojo.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author chenbin
 * @date 2021/7/31
 */


/**
 * @author chenbin
 * @description: 服务层
 * @version: V1.0
 */
@Service
public class AreaService {

    @Autowired
    private AreaDao areaDao;


    /**
     * 查询全部列表
     *
     * @return
     */
    public List<Area> findAll() {
        return areaDao.findAll();
    }


    /**
     * 条件查询+分页
     *
     * @param whereMap
     * @param page
     * @param size
     * @return
     */
    public Page<Area> findSearch(Map whereMap, int page, int size) {
        Specification<Area> specification = createSpecification(whereMap);
        PageRequest pageRequest = PageRequest.of(page - 1, size);
        return areaDao.findAll(specification, pageRequest);
    }


    /**
     * 条件查询
     *
     * @param whereMap
     * @return
     */
    public List<Area> findSearch(Map whereMap) {
        Specification<Area> specification = createSpecification(whereMap);
        return areaDao.findAll(specification);
    }

    /**
     * 根据ID查询实体
     *
     * @param id
     * @return
     */
    public Area findById(Long id) {
        return areaDao.findById(id).orElse(null);
    }

    /**
     * 修改
     *
     * @param Area
     */
    public void save(Area Area) {
        areaDao.save(Area);
    }

    /**
     * 删除
     *
     * @param id
     */
    public void deleteById(Long id) {
        areaDao.deleteById(id);
    }

    /**
     * 动态条件构建
     *
     * @param searchMap
     * @return
     */
    private Specification<Area> createSpecification(Map searchMap) {

        return (root, query, cb) -> {
            List<Predicate> predicateList = new ArrayList<Predicate>();
            // 序列号
            if (searchMap.get("id") != null && !"".equals(searchMap.get("id"))) {
                predicateList.add(cb.like(root.get("id").as(String.class), "%" + searchMap.get("id") + "%"));
            }
            return cb.and(predicateList.toArray(new Predicate[0]));

        };

    }

}

