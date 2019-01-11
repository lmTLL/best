package com.qfedu.service;

import com.qfedu.pojo.Car;
import com.qfedu.vo.ResultVo;

public interface CarService {
    ResultVo getAllCar(Long carUid);

    ResultVo addCar(Long carUid,Long carGcount, Long carGid);

    ResultVo updateAllCar(Long carUid);

    ResultVo updateOneCar(Long carId);

    ResultVo updateCarcount(Long carGcount,Long carId);

    ResultVo selectMaxId();
}
