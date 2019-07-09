package com.wangfj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * consul服务注册中心下载地址 https://www.consul.io/downloads.html
 * consul服务注册中心启动命令，consul agent -dev
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MicroServiceConsulClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceConsulClientApplication.class, args);
    }

}
