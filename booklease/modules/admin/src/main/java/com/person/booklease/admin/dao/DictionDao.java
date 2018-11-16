package com.person.booklease.admin.dao;

import com.person.booklease.admin.model.entity.DictionEntity;
import com.person.booklease.common.base.base.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * t_diction 持久化层
 * 
 * @author : Martin 
 * @date : 2018/11/16 09:23
 */
@Mapper
public interface DictionDao extends BaseDao<DictionEntity, Integer> {
}