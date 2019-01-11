package com.qfedu.service;

import com.qfedu.pojo.Car;
import com.qfedu.vo.ResultVo;

public interface CarService {
    ResultVo getAllCar(Integer carUid);

    ResultVo insertSelective(Car record);

    ResultVo updateAllCar(Integer carUid);
}
