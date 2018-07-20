package com.example.privoder;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
@EnableDubbo
@ImportResource({"classpath:applicationContext-dubbo.xml" })
public class PrivoderApplication {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(PrivoderApplication.class, args);
		System.out.println("provider is started");
		System.in.read();
	}
}
