package com.qfedu.serviceImpl;

import com.qfedu.dao.AirMapper;
import com.qfedu.pojo.Air;
import com.qfedu.service.AirService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirServiceImpl implements AirService {
    @Autowired
    private AirMapper dao;
    @Override
    public ResultVo selectAll() {
        Air air = dao.selectAll();
        if (air!=null){
            return ResultVo.setOK(air);
        }else{
            return ResultVo.setERROR("什么都没有");
        }

    }

    @Override
    public ResultVo UpdateTem(Integer airTem) {
        if (dao.updateTem(airTem)>0){
            return ResultVo.setOK(null);
        }else{
            return  ResultVo.setERROR();
        }

    }

    @Override
    public ResultVo UpdateWsp(Integer airWsp) {
       if (dao.updateWsp(airWsp)>0){
           return ResultVo.setOK(null);
       }else{
           return ResultVo.setERROR();
       }

    }

    @Override
    public ResultVo UpdateWdir(Integer airWdir) {
        if (dao.updateWdir(airWdir)>0){
            return ResultVo.setOK(null);
        }else{
            return  ResultVo.setERROR();
        }

    }
}
