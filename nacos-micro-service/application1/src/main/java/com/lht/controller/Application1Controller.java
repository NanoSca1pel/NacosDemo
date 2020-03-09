package com.lht.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lhtao
 * @date 2020-03-09 20:28
 */
@RestController
public class Application1Controller {

    //注入service(基于dubbo协议)
    @GetMapping("/service")
    public String service() {
        return "test";
    }
}
