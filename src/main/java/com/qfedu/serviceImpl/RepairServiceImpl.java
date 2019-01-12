package com.qfedu.serviceImpl;

import com.qfedu.dao.RepairMapper;
import com.qfedu.pojo.Repair;
import com.qfedu.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RepairServiceImpl implements RepairService {
    @Autowired
    private RepairMapper rpDao;
    @Override
    public int addRepair(Repair repair) {
        return rpDao.insertSelective(repair);
    }
}
