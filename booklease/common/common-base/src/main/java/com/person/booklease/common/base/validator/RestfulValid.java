package com.person.booklease.common.base.validator;

import javax.validation.GroupSequence;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;

/**
 * 功能描述:
 *
 * @author Martin
 * @version V1.0
 * @date 2018/11/14
 */
public interface RestfulValid {
    interface GET {
    }

    interface DELETE {
    }

    interface PUT {
    }

    interface POST {
    }

    interface PATCH {
    }

    /**
     * 定义校验顺序，如果POST组失败，则PUT组不会再校验
     */
    @GroupSequence({POST.class, PUT.class})
    interface POSTANDPUT {

    }
}
