package com.qfedu.dao;

import com.qfedu.pojo.FaultType;

import java.util.List;

public interface FaultTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FaultType record);

    int insertSelective(FaultType record);

    FaultType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FaultType record);

    int updateByPrimaryKey(FaultType record);

    List<FaultType> findAllType();
}