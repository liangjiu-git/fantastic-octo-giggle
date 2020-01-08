package com.mr.clj.easypoi.mapper;

import com.mr.clj.easypoi.entity.EasyPoiEntity;

import java.util.List;

public interface EasyPoiEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EasyPoiEntity record);

    int insertSelective(EasyPoiEntity record);

    EasyPoiEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EasyPoiEntity record);

    int updateByPrimaryKey(EasyPoiEntity record);

    List<EasyPoiEntity> list();

    void save(List<EasyPoiEntity> easyPoiEntities);
}