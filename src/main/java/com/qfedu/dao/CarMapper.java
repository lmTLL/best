package com.qfedu.dao;

import com.qfedu.pojo.Car;

import java.util.List;

public interface CarMapper {
    int deleteByPrimaryKey(Long carId);

    int insert(Car record);
    //添加购物车
    int insertSelective(Car record);

    Car selectByPrimaryKey(Long carId);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);
    //获取当前用户所有购物车信息
    List<Car> getAllCar(Integer carUid);

    //清除当前用户所有购物车
    int updateAllCar(Integer carUid);

    //用户清除当前购物车
    int updateOneCar(Integer carId);

    //修改商品数量
    int updateCarcount(Integer carGcount,Integer carId);





}