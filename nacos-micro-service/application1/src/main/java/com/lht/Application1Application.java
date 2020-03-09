package com.lht;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lhtao
 * @date 2020-03-09 20:37
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Application1Application {

    public static void main(String[] args){
        SpringApplication.run(Application1Application.class, args);
    }
}
