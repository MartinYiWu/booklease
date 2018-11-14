package com.person.booklease.common.base.constant;

/**
 *
 * 功能描述: RabbitMq 队列常量
 * @author Martin
 * @date 2018/11/14
 * @version V1.0
 */
public interface RabbitQueueConstant {

    /**
     * 系统操作日志记录
     */
    String SYS_LOG_QUEUE = "SYS_LOG_QUEUE";

    /**
     * 业务消息队列消费日志
     */
    String LOG_MESSAGE_QUEUE = "LOG_MESSAGE_QUEUE";

    /**
     * 商机业务消息队列
     */
    String MUSTANG_TRANSFER_QUEUE = "MUSTANG_TRANSFER_QUEUE";

}
