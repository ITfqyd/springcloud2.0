package com.fqyd.springcloud_eureka_ha;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer     //表示开启eureka服务
public class SpringcloudEurekaHaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaHaApplication.class, args);
    }

}
