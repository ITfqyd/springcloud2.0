package com.fqyd.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description：
 * Author: wude
 * Date:  2019/7/10 16:44
 * Modified By:
 */
@RestController
public class MeberApiController {
    @Value("${server.port}")
    private String port;
    @RequestMapping("getMember")
    public  String getMember(){
        return "this is member!端口号为："+port;
    }
}
