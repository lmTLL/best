package com.qfedu.serviceImpl;

import com.qfedu.dao.GimgMapper;
import com.qfedu.pojo.Gimg;
import com.qfedu.service.GimgService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GimgServiceImpl implements GimgService {

    @Autowired
    private GimgMapper dao;
    @Override
    public ResultVo getAllGimg(Long imgGid) {
        List<Gimg> list = dao.getAllGimg(imgGid);
        if (list!=null){
            return ResultVo.setOK(list);
        }else{
            return ResultVo.setERROR("找不到本商品的任何图片");
        }


    }
}
