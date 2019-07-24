package com.fqyd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
public class SpringcloudConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsumerApplication.class, args);
    }

    /**
     * 解决restTemplate bean找不到的问题，加入spring boot容器中@bean
     * @return
     */
    @Bean
    @LoadBalanced    //如果使用restTemplate远程调用，依赖于
    RestTemplate restTemplate() {
        return new RestTemplate();
    }


}
