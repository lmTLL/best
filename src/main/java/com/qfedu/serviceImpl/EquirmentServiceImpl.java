package com.qfedu.serviceImpl;

import com.qfedu.dao.EquipmentMapper;
import com.qfedu.pojo.Equipment;
import com.qfedu.service.EquirmentService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquirmentServiceImpl implements EquirmentService {
    @Autowired
    private EquipmentMapper dao;
    @Override
    public ResultVo addEquirment(Integer eqGid, Integer eqUid) {
        Equipment equipment = new Equipment();
        if (eqGid!=null && eqGid!=0){
            equipment.setEqGid(eqGid);
        }
        if (eqUid!=null && eqUid!=0){
            equipment.setEqUid(eqUid);
        }
        if (dao.insertSelective(equipment)>0){
            return ResultVo.setOK(null);
        }else{
            return ResultVo.setERROR("添加失败");
        }

    }

    @Override
    public ResultVo selectEqByUserId(Integer eqUid) {
        List<Equipment> list = dao.selectEqByUserId(eqUid);
        if (list!=null){
            return  ResultVo.setOK(list);
        }else{
            return  ResultVo.setERROR("没有找到啊。。");
        }

    }
}
