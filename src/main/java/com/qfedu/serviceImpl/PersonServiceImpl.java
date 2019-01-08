package com.qfedu.serviceImpl;

import com.qfedu.dao.PersonMapper;
import com.qfedu.pojo.Person;
import com.qfedu.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonMapper psersonDao;

    @Override
    public Person selectPersonById(Long PersonId) {
        Person person = psersonDao.selectByPrimaryKey(PersonId);
        return person;
    }
}
