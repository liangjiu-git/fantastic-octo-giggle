package com.mr.clj.easypoi.service.impl;

import com.mr.clj.easypoi.entity.EasyPoiEntity;
import com.mr.clj.easypoi.mapper.EasyPoiEntityMapper;
import com.mr.clj.easypoi.service.EasyPoiService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName EasyPoiServiceImpl
 * @Description: TODO
 * @Author 9
 * @Date 2020/1/6
 * @Version V1.0
 **/
@Service
public class EasyPoiServiceImpl implements EasyPoiService {

    @Resource
    private EasyPoiEntityMapper mapper;

    @Override
    public List<EasyPoiEntity> list() {
        return mapper.list();
    }

    @Override
    public void save(List<EasyPoiEntity> easyPoiEntities) {
        mapper.save(easyPoiEntities);
    }
}