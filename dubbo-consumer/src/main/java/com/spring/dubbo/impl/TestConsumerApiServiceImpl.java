package com.spring.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.spring.dubbo.TestConsumerApi;
import com.spring.dubbo.TestProviderApi;
import org.springframework.stereotype.Component;

@Service(version = "1.0.0")
@Component
public class TestConsumerApiServiceImpl implements TestConsumerApi {

    @Reference(version = "1.0.0")
    private TestProviderApi testProviderApi;

    @Override
    public void printConsumer() {
        System.out.println("消费方启动");
    }

    public void consume(){
        testProviderApi.printProvider();
    }

}
