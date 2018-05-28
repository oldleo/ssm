package com.cdinit.mapper;

import com.cdinit.po.UserEntity;

import java.util.List;

/**
 * Author: sun_chuan
 * Date: 2018/5/28
 * Time: 16:06
 * Description:
 */

public interface UserEntityMapper {
    /**
     * 查找所有的用户信息
     *
     * @return
     */
    List<UserEntity> getAllUsers();
}