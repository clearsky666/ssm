package com.clearsky.ssm.service.impl;

import com.clearsky.ssm.dao.UserDao;
import com.clearsky.ssm.pojo.User;
import com.clearsky.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<User> findAll() {
        return userDao.findAll();
    }
}
