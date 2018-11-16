package com.person.booklease.admin.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * t_bookinfo 实体类
 * 
 * @author : Martin 
 * @date : 2018/11/16 09:31
 */
@Data
public class BorrowinfoEntity implements Serializable {
    /**
	 * 图书基本信息表主键 id
	 **/
    private Integer id;

    /**
	 * 图书编号 book_number
	 **/
    private String bookNumber;

    /**
	 * 图书名字 book_name
	 **/
    private String bookName;

    /**
	 * 库存量 book_stock
	 **/
    private Integer bookStock;

    /**
	 * 图书价格 book_price
	 **/
    private BigDecimal bookPrice;

    /**
	 * 图书种类 book_type
	 **/
    private String bookType;

    /**
	 * 状态 status
	 **/
    private String status;

    /**
	 * 创建时间 create_time
	 **/
    private Date createTime;

    /**
	 * 创建人 create_by
	 **/
    private String createBy;

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