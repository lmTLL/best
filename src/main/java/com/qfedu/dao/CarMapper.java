package com.qfedu.dao;

import com.qfedu.pojo.Car;

public interface CarMapper {
    int deleteByPrimaryKey(Long carId);

    int insert(Car record);

    int insertSelective(Car record);

    Car selectByPrimaryKey(Long carId);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);
}