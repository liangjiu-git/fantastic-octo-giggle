package com.mr.clj.easypoi.service;

import com.mr.clj.easypoi.entity.EasyPoiEntity;

import java.util.List;

/**
 * @ClassName EasyPoiService
 * @Description: TODO
 * @Author 9
 * @Date 2020/1/6
 * @Version V1.0
 **/
public interface EasyPoiService {
    List<EasyPoiEntity> list();

    void save(List<EasyPoiEntity> easyPoiEntities);
}