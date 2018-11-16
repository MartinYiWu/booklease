package com.person.booklease.admin.dao;

import com.person.booklease.admin.model.entity.UserTokenEntity;
import com.person.booklease.common.base.base.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * t_user_token 持久化层
 * 
 * @author : Martin 
 * @date : 2018/11/15 11:34
 */
@Mapper
public interface UserTokenDao extends BaseDao<UserTokenEntity, Long> {
}