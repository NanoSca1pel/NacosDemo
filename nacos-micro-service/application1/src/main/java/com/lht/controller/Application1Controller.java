package com.lht.controller;

import com.lht.service.ConsumerService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lhtao
 * @date 2020-03-09 20:28
 */
@RestController
public class Application1Controller {

    //注入service(基于dubbo协议), 生成接口代理对象，通过代理对象进行远程调用
    @org.apache.dubbo.config.annotation.Reference
    ConsumerService consumerService;

    @GetMapping("/service")
    public String service() {

        //远程调用
        String service = consumerService.service();
        return "test " + service;
    }
}
