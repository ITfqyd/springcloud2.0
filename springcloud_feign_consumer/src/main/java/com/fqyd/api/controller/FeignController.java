package com.fqyd.api.controller;

import com.fqyd.feign.MemberApiFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description：
 * Author: wude
 * Date:  2019/7/23 16:42
 * Modified By:
 */
@RestController
public class FeignController {
    @Autowired
    private MemberApiFeign memberApiFeign;

    @RequestMapping("/feignMember")
    public String feignMember(){
        return memberApiFeign.getMember();
    };
}
