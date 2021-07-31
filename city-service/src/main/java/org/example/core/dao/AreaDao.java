package org.example.core.dao;

import org.example.core.pojo.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author chenbin
 * @date 2021/7/31
 */
public interface AreaDao extends JpaRepository<Area,Long>, JpaSpecificationExecutor<Area> {

}
