package com.lht.service.impl;

import com.lht.service.ProviderService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author lhtao
 * @date 2020/3/10 16:40
 */
@org.apache.dubbo.config.annotation.Service
public class ProviderServiceImpl implements ProviderService {


    public String service() {
        return "Provider dubbo invoke";
    }
}
