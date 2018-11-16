package com.person.booklease.admin.model.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * t_integral_detail 实体类
 * 
 * @author : Martin 
 * @date : 2018/11/16 09:21
 */
@Data
public class IntegralDetailEntity implements Serializable {
    /**
	 * 积分明细表主键Id id
	 **/
    private Integer id;

    /**
	 * 用户id user_id
	 **/
    private Integer userId;

    /**
	 * 积分类型 -1：积分扣除  1：积分增加 integral_type
	 **/
    private Integer integralType;

    /**
	 * 积分数量 integral_score
	 **/
    private Integer integralScore;

    /**
	 * 积分变动来源 sorce
	 **/
    private String sorce;

    /**
	 * 积分变动说明 message
	 **/
    private String message;

    /**
	 * 创建时间 create_time
	 **/
    private Date createTime;

    private static final long serialVersionUID = 1L;
}