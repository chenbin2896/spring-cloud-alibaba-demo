package org.example.core.service;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.test.common.Result;
import org.example.core.client.AreaClient;
import org.example.core.mapper.AreaRepository;
import org.example.core.pojo.Area;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author chenbin
 * @date 2021/8/1
 */
@Service
public class AreaService {

    private Log log = LogFactory.get();

    @Resource
    private AreaClient areaClient;

    @Resource
    private AreaRepository areaRepository;

    @Resource
    private ElasticsearchRestTemplate elasticsearchRestTemplate;

    public void importAll() {
        Result<List<Area>> all = areaClient.findAll();
        List<Area> data = all.getData();
        System.out.println(data.size());

        areaRepository.saveAll(data);
    }

}
