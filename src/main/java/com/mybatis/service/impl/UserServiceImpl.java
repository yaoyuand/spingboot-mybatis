package com.mybatis.service.impl;

import com.mybatis.dao.UserDao;
import com.mybatis.model.User;
import com.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private  UserDao userDao;
    @Override
    public List<User> show() {
        return userDao.show();
    }

    @Override
    public User findById(Integer id) {
        return userDao.searchById(id);
    }

    @Override
    public void insert(User user) {
        userDao.insert(user);
    }

    @Override
    public void delete(Integer id) {
        userDao.delete(id);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }
}
