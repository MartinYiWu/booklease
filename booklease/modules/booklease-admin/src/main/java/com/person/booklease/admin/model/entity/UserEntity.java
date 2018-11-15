package com.person.booklease.admin.model.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * t_user 实体类
 * 
 * @author : Martin 
 * @date : 2018/11/15 11:30
 */
@Data
public class UserEntity implements Serializable {
    /**
	 * 用户id id
	 **/
    private Integer id;

    /**
	 * 用户账号 user_account
	 **/
    private String userAccount;

    /**
	 * 用户名字 user_name
	 **/
    private String userName;

    /**
	 * 用户昵称 nick_name
	 **/
    private String nickName;

    /**
	 * 用户头像 image
	 **/
    private String image;

    /**
	 * 用户密码 password
	 **/
    private String password;

    /**
	 * 手机号码 phone
	 **/
    private String phone;

    /**
	 * 性别 sex
	 **/
    private String sex;

    /**
	 * 类型：ordinary :普通用户  system:系统用户 user_type
	 **/
    private String userType;

    /**
	 * 状态:y 激活  n 关闭 status
	 **/
    private String status;

    /**
	 * 创建时间 create_time
	 **/
    private Date createTime;

    /**
	 * 更新时间 update_time
	 **/
    private Date updateTime;

    /**
	 * 最后更新人 last_update_by
	 **/
    private String lastUpdateBy;

    private static final long serialVersionUID = 1L;
}