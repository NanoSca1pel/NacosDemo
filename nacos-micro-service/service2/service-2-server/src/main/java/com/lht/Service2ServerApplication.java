package com.lht;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lhtao
 * @date 2020/3/10 16:41
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Service2ServerApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Service2ServerApplication.class, args);
    }
}
