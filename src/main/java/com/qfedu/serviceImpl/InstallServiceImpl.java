package com.qfedu.serviceImpl;

import com.qfedu.dao.InstallMapper;
import com.qfedu.pojo.Install;
import com.qfedu.service.InstallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstallServiceImpl implements InstallService {
    @Autowired
    private InstallMapper installDao;
    @Override
    public int addInstall(Install install) {
        return installDao.insertSelective(install);
    }
}
