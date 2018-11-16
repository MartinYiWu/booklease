package com.person.booklease.admin.dao;

import com.person.booklease.admin.model.entity.BorrowinfoEntity;
import com.person.booklease.common.base.base.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * t_bookinfo 持久化层
 * 
 * @author : Martin 
 * @date : 2018/11/16 09:31
 */
@Mapper
public interface BorrowinfoDao extends BaseDao<BorrowinfoEntity, Integer> {
}