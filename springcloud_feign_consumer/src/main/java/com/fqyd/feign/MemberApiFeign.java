package com.fqyd.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description：
 * Author: wude
 * Date:  2019/7/23 16:11
 * Modified By:
 */
@FeignClient(name = "fqyd-member")
public interface MemberApiFeign {
    //FeignClient  调用服务接口
    @RequestMapping("getMember")
    public  String getMember();
}
