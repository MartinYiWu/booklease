package com.person.booklease.common.base.messgae;

import lombok.Data;

/**
 *
 * 功能描述: 统一结果返回
 * @author Martin
 * @date 2018/9/30
 * @version V1.0
 */
@Data
public class ResponseVo<T> {

    private int code = 200;

    private String message="数据操作成功";

    private T result;

    public ResponseVo(int code, String message, T result) {
        this.code = code;
        this.message = message;
        this.result = result;

    }

    public ResponseVo(int code, String message) {
        this.code = code;
        this.message = message;

    }


    public ResponseVo() {

    }

    public ResponseVo(T result) {
        this.result = result;
    }
}
