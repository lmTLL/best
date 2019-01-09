package com.qfedu.dao;

import com.qfedu.pojo.Equipment;

import java.util.List;

public interface EquipmentMapper {
    int deleteByPrimaryKey(Integer eqId);

    int insert(Equipment record);

    int insertSelective(Equipment record);

    Equipment selectByPrimaryKey(Integer eqId);

    int updateByPrimaryKeySelective(Equipment record);

    int updateByPrimaryKey(Equipment record);

    List<Equipment> selectEqByUserId(Integer eqUid);
}