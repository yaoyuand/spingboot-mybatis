package com.mybatis.service;

import com.mybatis.model.User;

import java.util.List;

public interface UserService {
    public List<User> show();
    public User findById(Integer id);
    public void insert(User user);
    public void delete(Integer id);
    public void update(User user);
}
