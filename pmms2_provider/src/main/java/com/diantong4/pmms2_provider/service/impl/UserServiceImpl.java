package com.diantong4.pmms2_provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.diantong4.entity.User;
import com.diantong4.service.UserService;
import com.diantong4.pmms2_provider.dao.UserMapper;

import javax.annotation.Resource;
import java.util.List;

@Service(timeout = 10000)
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public String getName() {
        return userMapper.getName();
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}