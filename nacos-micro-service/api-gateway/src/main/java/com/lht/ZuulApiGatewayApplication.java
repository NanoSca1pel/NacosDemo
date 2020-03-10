package com.lht;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author lhtao
 * @date 2020/3/10 17:11
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApiGatewayApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ZuulApiGatewayApplication.class, args);
    }
}
