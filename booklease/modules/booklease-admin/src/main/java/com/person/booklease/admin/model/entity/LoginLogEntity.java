package com.person.booklease.admin.model.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * t_login_log 实体类
 * 
 * @author : Martin 
 * @date : 2018/11/15 11:36
 */
@Data
public class LoginLogEntity implements Serializable {
    private Integer id;

    /**
	 * 登录名称 login_name
	 **/
    private String loginName;

    /**
	 * 是否成功 success
	 **/
    private String success;

    /**
	 * 用户id user_id
	 **/
    private Integer userId;

    /**
	 * 消息 message
	 **/
    private String message;

    private String ip;

    /**
	 * 操作时间 create_time
	 **/
    private Date createTime;

    private static final long serialVersionUID = 1L;
}