package com.fqyd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudZkConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudZkConsumerApplication.class, args);
    }

    /**
     * 解决restTemplate bean找不到的问题，加入spring boot容器中@bean
     * @return
     */
    @Bean
    @LoadBalanced
    //如果使用restTemplate远程调用，依赖于
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
