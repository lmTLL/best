package com.qfedu.serviceImpl;

import com.qfedu.dao.LogisticsMapper;
import com.qfedu.pojo.Logistics;
import com.qfedu.service.LogisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LogisticServiceImpl implements LogisticService {
    @Autowired
    private LogisticsMapper  lgDao;
    @Override
    public List<Logistics> findAllStatus() {
        return lgDao.findAllStatus();
    }
}
