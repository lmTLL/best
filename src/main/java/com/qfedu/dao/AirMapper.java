package com.qfedu.dao;

import com.qfedu.pojo.Air;

public interface AirMapper {
    int deleteByPrimaryKey(Integer airId);

    int insert(Air record);

    int insertSelective(Air record);

    Air selectByPrimaryKey(Integer airId);

    int updateByPrimaryKeySelective(Air record);

    int updateByPrimaryKey(Air record);

    Air selectAll();

    int updateTem(Integer airTem);

    int updateWsp(Integer airWsp);

    int updateWdir(Integer airWdir);
}