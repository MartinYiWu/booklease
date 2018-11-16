package com.person.booklease.admin.dao;

import com.person.booklease.admin.model.entity.BookDonationEntity;
import com.person.booklease.common.base.base.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * t_book_donation 持久化层
 * 
 * @author : Martin 
 * @date : 2018/11/16 09:34
 */
@Mapper
public interface BookDonationDao extends BaseDao<BookDonationEntity, Integer> {
}