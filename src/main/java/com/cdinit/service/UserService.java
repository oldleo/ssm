package com.cdinit.service;

import com.cdinit.po.UserEntity;

import java.util.List;

/**
 * Author: sun_chuan
 * Date: 2018/5/28
 * Time: 16:09
 * Description:
 */
public interface UserService {
    /**
     * Desc:用户表相关的service接口
     * Created by hafiz.zhang on 2016/8/27.
     */
    /**
     * 获取所有的用户信息
     *
     * @return
     */
    List<UserEntity> getAllUsers();
}