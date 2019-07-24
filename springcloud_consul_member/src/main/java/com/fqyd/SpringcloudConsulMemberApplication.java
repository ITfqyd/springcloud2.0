package com.fqyd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient   //如果服务注册是consul或者zk，可以使用该注解
public class SpringcloudConsulMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsulMemberApplication.class, args);
    }

}
