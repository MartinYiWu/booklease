package com.person.booklease.admin.model.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * t_diction 实体类
 * 
 * @author : Martin 
 * @date : 2018/11/16 09:23
 */
@Data
public class DictionEntity implements Serializable {
    /**
	 * 字典表主键id id
	 **/
    private Integer id;

    /**
	 * 字典名 dicti_name
	 **/
    private String dictiName;

    /**
	 * 字典组 dicti_group
	 **/
    private String dictiGroup;

    /**
	 * v dicti_decs
	 **/
    private String dictiDecs;

    /**
	 * 排序 sort
	 **/
    private Integer sort;

    /**
	 * 状态：0：不可用  1：可用 status
	 **/
    private Integer status;

    /**
	 * 创建时间 createt_time
	 **/
    private Date createtTime;

    /**
	 * 更新时间 update_time
	 **/
    private Date updateTime;

    /**
	 * 最后修改人 last_update_by
	 **/
    private String lastUpdateBy;

    private static final long serialVersionUID = 1L;
}