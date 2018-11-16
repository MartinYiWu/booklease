package com.person.booklease.admin.model.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * t_borrow_comment 实体类
 * 
 * @author : Martin 
 * @date : 2018/11/16 09:30
 */
@Data
public class BorrowCommentEntity implements Serializable {
    /**
	 * 借阅评论表主键Id id
	 **/
    private Integer id;

    /**
	 * 评论用户id user_id
	 **/
    private Integer userId;

    /**
	 * 评论内容 content
	 **/
    private String content;

    /**
	 * 图书编号 book_number
	 **/
    private String bookNumber;

    /**
	 * 评论时间 create_time
	 **/
    private Date createTime;

    /**
	 * 评论是否有效 y：有效  n:无效 status
	 **/
    private String status;

    private static final long serialVersionUID = 1L;
}