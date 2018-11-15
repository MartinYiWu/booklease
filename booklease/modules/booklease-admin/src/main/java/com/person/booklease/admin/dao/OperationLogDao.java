package com.person.booklease.admin.dao;

import com.person.booklease.admin.model.entity.OperationLogEntity;
import com.person.booklease.common.base.base.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * t_operation_log 持久化层
 * 
 * @author : Martin 
 * @date : 2018/11/15 11:35
 */
@Mapper
public interface OperationLogDao extends BaseDao<OperationLogEntity, Integer> {
}