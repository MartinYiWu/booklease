package com.person.booklease.common.base.base;


import com.person.booklease.common.base.messgae.ResponseType;
import com.person.booklease.common.base.messgae.ResponseVo;

/**
 * @Author:chenyiwu
 * @Describtion: 业务逻辑层返回数据统一抽取
 * @Create Time:2018/7/2
 */
public class BaseManage {
    protected ResponseVo SUCCESS() {
        return new ResponseVo();
    }

    protected ResponseVo SUCCESS(String message) {
        return new ResponseVo(message);
    }

    protected ResponseVo SUCCESS(int code, String message) {
        return new ResponseVo(code, message);
    }

    protected ResponseVo SUCCESS(Object result) {
        return new ResponseVo(result);
    }

    protected ResponseVo SUCCESS(int code, String message, Object result) {
        return new ResponseVo(code, message, result);
    }

    protected ResponseVo SUCCESS(ResponseType rt) {
        return new ResponseVo(rt.code(), rt.message(), null);
    }

    protected ResponseVo FAIL(ResponseType rt) {
        return new ResponseVo(rt.code(), rt.message(), null);
    }

    protected ResponseVo FAIL (String message) {
        return new ResponseVo(message);
    }

    protected ResponseVo FAIL(int code, String message) {
        return new ResponseVo(code, message, null);
    }

}
