package com.person.booklease.admin.dao;

import com.person.booklease.admin.model.entity.IntegralDetailEntity;
import com.person.booklease.common.base.base.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * t_integral_detail 持久化层
 * 
 * @author : Martin 
 * @date : 2018/11/16 09:21
 */
@Mapper
public interface IntegralDetailDao extends BaseDao<IntegralDetailEntity, Integer> {
}