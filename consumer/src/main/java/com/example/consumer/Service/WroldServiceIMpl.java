package com.example.consumer.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.api.DemoService;
import org.springframework.stereotype.Component;

@Component
public class WroldServiceIMpl {

    @Reference(version = "1.0.1")
    DemoService demoService;

    public void printWrold() {
        System.out.println(demoService.sayHello("world"));
    }


}
