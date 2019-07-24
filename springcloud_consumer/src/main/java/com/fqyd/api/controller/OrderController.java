package com.fqyd.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Description：
 * Author: wude
 * Date:  2019/7/10 17:29
 * Modified By:
 */
@RestController
public class OrderController {
    //restTemplate是由spring web组件提供的 默认是聚合rabiion负载均衡起
    //rest方式底层是采用httclient技术
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 在springcloud中，又两种方式调用rest,fegin(springcloud)
     * @return
     */
    //订单服务调用会员服务
    @RequestMapping("getOrder")
    public String getOrder(){
         String result = restTemplate.getForObject("http://fqyd-member/getMember", String.class);
         //String result = restTemplate.getForObject("http://127.0.0.1:8000/getMember", String.class);
         System.out.println("订单服务调用会员服务返回结果result:"+result);
        return result;
     };
}
