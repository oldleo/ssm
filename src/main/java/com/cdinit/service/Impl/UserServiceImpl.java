package com.cdinit.service.Impl;

import com.cdinit.mapper.UserEntityMapper;
import com.cdinit.po.UserEntity;
import com.cdinit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: sun_chuan
 * Date: 2018/5/28
 * Time: 16:09
 * Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserEntityMapper userEntityMapper;

    @Override
    public List<UserEntity> getAllUsers() {
        return userEntityMapper.getAllUsers();
    }
}