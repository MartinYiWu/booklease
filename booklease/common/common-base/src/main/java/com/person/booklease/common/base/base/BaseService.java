package com.person.booklease.common.base.base;



import com.person.booklease.common.base.utils.PageQuery;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 *
 * 功能描述: 底层基类service
 * @author Martin
 * @date 2018/11/14
 * @version V1.0
 */
public interface BaseService<T, ID extends Serializable> {
    /**
     * 增加
     */
    int save(T entity);

    int save(Map<String, Object> map);

    int saveBatch(List<T> list);

    /**
     * 更新
     */
    int update(T entity);

    int update(Map<String, Object> map);

    /**
     * 删除
     */
    int delete(ID id);

    int delete(Map<String, Object> map);

    int deleteBatch(ID[] id);

    int deleteBatch(Object[] id);

    int deleteList(List<T> entity);

    /**
     * 查询
     */
    T findOne(ID id);

    List<T> findList(T entity);

    List<T> findList(Map<String, Object> map);

    List<T> findPage(PageQuery pageQuery);

    /**
     * 实体属性的记录数量
     */
    int count(T entity);

    /**
     * 实体是否存在
     */
    boolean exsit(T entity);

}
