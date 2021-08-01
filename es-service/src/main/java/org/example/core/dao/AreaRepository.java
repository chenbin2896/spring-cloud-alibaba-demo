package org.example.core.dao;

import org.example.core.pojo.Area;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author chenbin
 * @date 2021/8/1
 */
public interface AreaRepository extends ElasticsearchRepository<Area,Long> {
}
