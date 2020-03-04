package com.lht.nacos;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.listener.Listener;
import com.alibaba.nacos.api.exception.NacosException;

import java.util.Properties;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/**
 * @author lhtao
 * @date 2020-03-04 20:14
 */
public class SimpleNacosDemo {

    public static void main(String[] args) throws NacosException {

        //使用nacos client远程获取nacos服务上的配置信息
        //nacos 地址
        String serverAddr = "127.0.0.1:8848";
        //namespace(类似public\dev\test各个环境配置) 如果没有指定，默认使用public保留空间
        String namespace="dcac3d99-bb33-4112-8667-c2296c00213d";
        //Group(类似订单、仓储、物流各种服务配置)
        String group= "DEFAULT_GROUP";
        //DataId(具体的到某个功能的配置)
        String dataId = "nacos-simple-demo-dev.yml";

        Properties properties = new Properties();
        properties.put("serverAddr", serverAddr);
        properties.put("namespace", namespace);
        ConfigService configService = NacosFactory.createConfigService(properties);
        //获取配置(dataId, group, 连接超时时间)
        String content = configService.getConfig(dataId, group, 5000);
        System.out.println(content);

        configService.addListener(dataId, group, new Listener() {
            public Executor getExecutor() {
                return null;
            }

            public void receiveConfigInfo(String s) {
                System.out.println(s);
            }
        });

        while (true) {
            try { TimeUnit.SECONDS.sleep(1); } catch(InterruptedException e) { e.printStackTrace(); }
        }
    }
}
