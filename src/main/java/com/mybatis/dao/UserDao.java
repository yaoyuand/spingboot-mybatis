package com.mybatis.dao;

import com.mybatis.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface UserDao {
    //查询全部
    public List<User> show();
    //单个查询
    public User searchById(Integer id);
    //修改
    public void update(User user);
    //新增
    public void insert(User user);
    //删除
    public void delete(Integer id);
}
