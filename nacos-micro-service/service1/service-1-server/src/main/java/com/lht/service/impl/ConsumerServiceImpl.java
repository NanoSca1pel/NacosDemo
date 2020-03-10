package com.lht.service.impl;

import com.lht.service.ConsumerService;
import com.lht.service.ProviderService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author lhtao
 * @date 2020/3/10 14:17
 */
@org.apache.dubbo.config.annotation.Service //这里是用dubbo包下的@Service注解，标注该注解的类会暴露为dubbo接口
public class ConsumerServiceImpl implements ConsumerService {

    @org.apache.dubbo.config.annotation.Reference
    ProviderService providerService;

    //dubbo接口实现内容
    public String service() {
        return providerService.service() + "|Consumer dubbo invoke";
    }
}
