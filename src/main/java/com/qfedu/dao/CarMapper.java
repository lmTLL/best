package com.qfedu.dao;

import com.qfedu.pojo.Car;
import org.apache.ibatis.annotations.Param;

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
    List<Car> getAllCar(Long carUid);

    //清除当前用户所有购物车
    int updateAllCar(Long carUid);

    //用户清除当前购物车
    int updateOneCar(Long carId);

    //修改商品数量
    int updateCarcount(@Param("carGcount") Long carGcount,@Param("carId") Long carId);

    //得到最大的carId
    Long selectMaxId();





}