package com.blog.index;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wangfujie
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class BlogIndexWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogIndexWebApplication.class, args);
	}

}