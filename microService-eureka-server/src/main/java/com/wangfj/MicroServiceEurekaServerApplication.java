package com.wangfj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//EnableEurekaServer微服务端启动类，接受其它微服务注册进来
public class MicroServiceEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceEurekaServerApplication.class, args);
	}
}
