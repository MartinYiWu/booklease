package com.person.booklease.admin.dao;

import com.person.booklease.admin.model.entity.LoginLogEntity;
import com.person.booklease.common.base.base.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * t_login_log 持久化层
 * 
 * @author : Martin 
 * @date : 2018/11/15 11:36
 */
@Mapper
public interface LoginLogDao extends BaseDao<LoginLogEntity, Integer> {
}