package com.person.booklease.admin.dao;

import com.person.booklease.admin.model.entity.RoleEntity;
import com.person.booklease.common.base.base.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * t_role 持久化层
 * 
 * @author : Martin 
 * @date : 2018/11/15 11:32
 */
@Mapper
public interface RoleDao extends BaseDao<RoleEntity, Integer> {
}