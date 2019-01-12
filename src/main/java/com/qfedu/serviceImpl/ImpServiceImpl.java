package com.qfedu.serviceImpl;

import com.qfedu.dao.ImpMapper;
import com.qfedu.pojo.Imp;
import com.qfedu.service.ImpService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpServiceImpl implements ImpService {
    @Autowired
    private ImpMapper dao;
    @Override
    public ResultVo getAllImp(Integer iGid) {
        List<Imp> list = dao.selectAllImp(iGid);
        if (list!=null){
            return ResultVo.setOK(list);
        }else{
            return ResultVo.setERROR("没有有关图片");
        }


    }
}
