package com.spring.dubbo.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.spring.dubbo.TestProviderApi;
import org.springframework.stereotype.Component;

@Service(version = "1.0.0")
@Component
public class TestProviderApiServiceImpl implements TestProviderApi {
    @Override
    public void printProvider() {
        System.out.println("提供方，消费方测试成功");
    }
}
