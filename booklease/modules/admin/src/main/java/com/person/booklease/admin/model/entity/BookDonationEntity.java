package com.person.booklease.admin.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * t_book_donation 实体类
 * 
 * @author : Martin 
 * @date : 2018/11/16 09:34
 */
@Data
public class BookDonationEntity implements Serializable {
    /**
	 * 图书捐赠记录表主键Id id
	 **/
    private Integer id;

    /**
	 * 捐赠人id user_id
	 **/
    private Integer userId;

    /**
	 * 图书类型 book_type
	 **/
    private String bookType;

    /**
	 * 书名 book_name
	 **/
    private String bookName;

    /**
	 * 价格 book_price
	 **/
    private BigDecimal bookPrice;

    /**
	 * 捐赠时间 create_time
	 **/
    private Date createTime;

    /**
	 * 捐赠数量 dona_num
	 **/
    private Integer donaNum;

    /**
	 * 状态：-1：审核不通过  0：待审核 1：审核通过 status
	 **/
    private Integer status;

    private static final long serialVersionUID = 1L;
}