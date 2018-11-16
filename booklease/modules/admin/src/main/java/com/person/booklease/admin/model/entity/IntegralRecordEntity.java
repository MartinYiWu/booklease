package com.person.booklease.admin.model.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * t_integral_record 实体类
 * 
 * @author : Martin 
 * @date : 2018/11/16 09:20
 */
@Data
public class IntegralRecordEntity implements Serializable {
    /**
	 * 积分总计表id id
	 **/
    private Integer id;

    /**
	 * 用户id user_id
	 **/
    private Integer userId;

    /**
	 * 积分总数 score
	 **/
    private Integer score;

    /**
	 * 可用积分 available_integral
	 **/
    private Integer availableIntegral;

    /**
	 * 创建时间 create_time
	 **/
    private Date createTime;

    /**
	 * 更新时间 update_time
	 **/
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}