package com.person.booklease.admin.model.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * t_role 实体类
 * 
 * @author : Martin 
 * @date : 2018/11/15 11:32
 */
@Data
public class RoleEntity implements Serializable {
    /**
	 * 角色表主键id role_id
	 **/
    private Integer roleId;

    /**
	 * 角色名称 role_name
	 **/
    private String roleName;

    /**
	 * 状态 role_status
	 **/
    private String roleStatus;

    /**
	 * 创建时间 create_time
	 **/
    private Date createTime;

    /**
	 * 更新/修改时间 update_time
	 **/
    private Date updateTime;

    /**
	 * 最后修改人 last_update_by
	 **/
    private String lastUpdateBy;

    private static final long serialVersionUID = 1L;
}