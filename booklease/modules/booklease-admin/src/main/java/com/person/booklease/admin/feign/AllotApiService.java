package com.person.booklease.admin.feign;

import com.hqjy.mustang.admin.feign.impl.AllotApiServiceFallbackImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 查询用户信息
 *
 * @author : HejinYo   hejinyo@gmail.com
 * @date :  2018/8/29 21:55
 */
@FeignClient(name = "mustang-allot", fallback = AllotApiServiceFallbackImpl.class)
public interface AllotApiService {

    /**
     * 招转重置部门分配算法Constant.API_PATH +
     */
    @GetMapping("/transfer/reset/dept/{deptId}")
    void restDeptList(@PathVariable("deptId") Long deptId);

    /**
     * 招转重置用户分配算法
     */
    @GetMapping("/transfer/reset/user/{deptId}")
    void restUserList(@PathVariable("deptId") Long deptId);


}
