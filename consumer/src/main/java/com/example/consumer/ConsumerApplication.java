package com.example.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.example.api.DemoService;
import com.example.consumer.Service.WroldServiceIMpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableDubbo
@ImportResource({"classpath:applicationContext-dubbo.xml" })
public class ConsumerApplication {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext ca= SpringApplication.run(ConsumerApplication.class, args);
		WroldServiceIMpl wroldServiceIMpl=ca.getBean(WroldServiceIMpl.class);
		wroldServiceIMpl.printWrold();
		System.in.read();
	}
}
