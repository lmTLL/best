package com.qfedu.serviceImpl;

import com.qfedu.dao.CarMapper;
import com.qfedu.pojo.Car;
import com.qfedu.service.CarService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarMapper dao;
    @Override
    public ResultVo getAllCar(Long carUid) {
        List<Car> list = dao.getAllCar(carUid);
        if (list!=null){
            return ResultVo.setOK(list);
        }else {
            return ResultVo.setERROR("数据为空");
        }

    }

    @Override
    public ResultVo addCar(Long carUid, Long carGcount, Long carGid) {
        Car car = new Car();
        if (carUid!=null&&carUid!=0){
            car.setCarUid(carUid);
        }
        if (carGid!=null&&carGid!=0){
            car.setCarGid(carGid);
        }
        if (carGcount!=null&&carGcount!=0){
            car.setCarGcount(carGcount);
        }

        if (dao.insertSelective(car)>0){

            return ResultVo.setOK(null);
        }else{
            return  ResultVo.setERROR("添加失败");
        }
    }


    @Override
    public ResultVo updateAllCar(Long carUid) {
        if (dao.updateAllCar(carUid)>0){
            return ResultVo.setOK(null);
        }else{
            return ResultVo.setERROR("修改状态失败");
        }

    }

    @Override
    public ResultVo updateOneCar(Long carId) {
        if (dao.updateOneCar(carId)>0){
            return ResultVo.setOK(null);
        }else{
            return ResultVo.setERROR("删除失败");
        }

    }

    @Override
    public ResultVo updateCarcount(Long carGcount, Long carGid) {
        if (dao.updateCarcount(carGcount,carGid)>0){
            return ResultVo.setOK(null);
        }else{
            return ResultVo.setERROR("数量修改失败");
        }

    }

    @Override
    public ResultVo selectMaxId() {
        Long MaxCarId = dao.selectMaxId();
        return ResultVo.setOK(MaxCarId);
    }
}
