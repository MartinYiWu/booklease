package com.person.booklease.admin.dao;

import com.person.booklease.admin.model.entity.UserEntity;
import com.person.booklease.common.base.base.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * t_user 持久化层
 * 
 * @author : Martin 
 * @date : 2018/11/15 11:30
 */
@Mapper
public interface UserDao extends BaseDao<UserEntity, Integer> {
}