package org.example.core.dao;

import org.apache.ibatis.annotations.Param;
import org.example.core.pojo.Employees;

/**
 * @author chenbin
 * @date 2021/8/29
 */
public interface EmployeeMapper {
    Employees findById(@Param("id") Long id);
}
