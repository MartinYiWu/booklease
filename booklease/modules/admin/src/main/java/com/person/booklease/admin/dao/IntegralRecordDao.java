package com.person.booklease.admin.dao;

import com.person.booklease.admin.model.entity.IntegralRecordEntity;
import com.person.booklease.common.base.base.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * t_integral_record 持久化层
 * 
 * @author : Martin 
 * @date : 2018/11/16 09:20
 */
@Mapper
public interface IntegralRecordDao extends BaseDao<IntegralRecordEntity, Integer> {
}