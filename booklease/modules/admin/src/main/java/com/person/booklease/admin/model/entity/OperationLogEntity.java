package com.person.booklease.admin.model.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * t_operation_log 实体类
 * 
 * @author : Martin 
 * @date : 2018/11/15 11:35
 */
@Data
public class OperationLogEntity implements Serializable {
    /**
	 * 业务操作日志记录表主键id id
	 **/
    private Integer id;

    /**
	 * 日志类型 log_type
	 **/
    private String logType;

    /**
	 * 日志名称 log_name
	 **/
    private String logName;

    /**
	 * 用户id user_id
	 **/
    private Integer userId;

    /**
	 * 类名 class_name
	 **/
    private String className;

    /**
	 * 调用方法 method
	 **/
    private String method;

    /**
	 * 请求参数 params
	 **/
    private String params;

    /**
	 * 时间 create_time
	 **/
    private Date createTime;

    /**
	 * 是否成功 success
	 **/
    private String success;

    /**
	 * 消息 message
	 **/
    private String message;

    /**
	 * 执行时间 time
	 **/
    private Long time;

    /**
	 * 执行ip地址 ip
	 **/
    private String ip;

    private static final long serialVersionUID = 1L;
}