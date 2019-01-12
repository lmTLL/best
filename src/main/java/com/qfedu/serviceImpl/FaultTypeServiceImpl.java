package com.qfedu.serviceImpl;

import com.qfedu.dao.FaultTypeMapper;
import com.qfedu.pojo.FaultType;
import com.qfedu.service.FaultTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaultTypeServiceImpl implements FaultTypeService {
    @Autowired
    private FaultTypeMapper ftDao;
    @Override
    public List<FaultType> findAllType() {
        return ftDao.findAllType();
    }
}
