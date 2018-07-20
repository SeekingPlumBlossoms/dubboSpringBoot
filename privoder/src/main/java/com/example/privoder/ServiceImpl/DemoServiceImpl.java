package com.example.privoder.ServiceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.api.DemoService;

@Service(version = "1.0.1")
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "hello "+name;
    }
}
