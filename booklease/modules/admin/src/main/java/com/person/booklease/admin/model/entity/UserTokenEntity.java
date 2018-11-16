package com.person.booklease.admin.model.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * t_user_token 实体类
 * 
 * @author : Martin 
 * @date : 2018/11/15 11:34
 */
@Data
public class UserTokenEntity implements Serializable {
    /**
	 * 编号 id
	 **/
    private Long id;

    private Long userId;

    /**
	 * token token
	 **/
    private String token;

    /**
	 * 过期时间 expire_time
	 **/
    private Date expireTime;

    /**
	 * 创建人 create_by
	 **/
    private String createBy;

    /**
	 * 创建时间 create_time
	 **/
    private Date createTime;

    /**
	 * 更新人 last_update_by
	 **/
    private String lastUpdateBy;

    /**
	 * 更新时间 last_update_time
	 **/
    private Date lastUpdateTime;

    private static final long serialVersionUID = 1L;
}