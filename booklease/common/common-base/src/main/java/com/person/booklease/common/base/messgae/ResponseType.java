package com.person.booklease.common.base.messgae;

/**
 * @Author:chenyiwu
 * @Describtion: 业务操作异常枚举类定义
 * @Create Time:2018/7/2
 */
public enum ResponseType {
    SUCCESS(200, "返回数据正确"),

    /**
     * 参数验证
     */
    PARAMETER_ERROR(1000, "业务参数错误"),

    /**
     * 通用错误
     */
    COMMOEM_ERROR(-1, "程序内部错误"),
    /**
     * 通用错误
     */
    TIME_ERROR(1, "请校验本地时间"),
    /**
     * 通用错误
     */
    SIGN_ERROR(2, "签名错误"),
    /**
     * 通用错误
     */
    PARSE_ERROR(3, "解密参数错误"),
    /**
     * 通用错误
     */
    DER_ERROR(4, "解密参数错误"),
    /**
     * 通用错误
     */
    UNKNOWN(5, "未知错误"),

    /**
     * 业务错误 从1001开始
     */
    SORE_ERROR(1001, ""),

    UPDATE_ERROR(1002, "更新失败"),

    EXIST_ERROR(1003, "数据已存在"),

    NOTEXIST_ERROR(1004, "数据不存在"),

    INSERT_ERROR(1006, "插入数据失败"),

    SELECT_ERROR(1101, "获取数据失败!"),

    DELETE_ERROR(1005,"删除数据失败"),
    /**
     * 业务请求成功 从2001开始
     */
    SELECT_SUCCESS(2001,"获取数据成功")
    ;

    private int code;

    private String message;

    ResponseType(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int code() {
        return code;
    }

    public String message() {
        return message;
    }

    public static ResponseType parse(int code) {
        ResponseType[] types = ResponseType.values();
        for (ResponseType type : types) {
            if (type.code() == code) {
                return type;
            }
        }
        return UNKNOWN;
    }
}
