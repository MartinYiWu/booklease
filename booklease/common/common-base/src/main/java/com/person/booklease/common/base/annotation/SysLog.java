package com.person.booklease.common.base.annotation;

import java.lang.annotation.*;

/**
 * 功能描述: 系统日志注解
 *
 * @author Martin
 * @version V1.0
 * @date 2018/11/14
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {

    String value() default "";
}
