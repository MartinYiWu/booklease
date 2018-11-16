package com.person.booklease.admin.dao;

import com.person.booklease.admin.model.entity.BorrowCommentEntity;
import com.person.booklease.common.base.base.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * t_borrow_comment 持久化层
 * 
 * @author : Martin 
 * @date : 2018/11/16 09:30
 */
@Mapper
public interface BorrowCommentDao extends BaseDao<BorrowCommentEntity, Integer> {
}