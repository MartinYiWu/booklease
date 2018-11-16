package com.person.booklease.admin.dao;

import com.person.booklease.admin.model.entity.BookImageEntity;
import com.person.booklease.common.base.base.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * t_book_image 持久化层
 * 
 * @author : Martin 
 * @date : 2018/11/16 09:32
 */
@Mapper
public interface BookImageDao extends BaseDao<BookImageEntity, Integer> {
}