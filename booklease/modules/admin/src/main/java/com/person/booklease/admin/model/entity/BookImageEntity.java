package com.person.booklease.admin.model.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * t_book_image 实体类
 * 
 * @author : Martin 
 * @date : 2018/11/16 09:32
 */
@Data
public class BookImageEntity implements Serializable {
    /**
	 * 图书附件表主键id id
	 **/
    private Integer id;

    /**
	 * 图书编号 book_number
	 **/
    private String bookNumber;

    /**
	 * 图片路径 image_path
	 **/
    private String imagePath;

    /**
	 * 图片类型 image_type
	 **/
    private String imageType;

    /**
	 * 创建时间 create_time
	 **/
    private Date createTime;

    /**
	 * 修改时间 update_time
	 **/
    private Date updateTime;

    /**
	 * 最后修改人 last_update_by
	 **/
    private String lastUpdateBy;

    private static final long serialVersionUID = 1L;
}