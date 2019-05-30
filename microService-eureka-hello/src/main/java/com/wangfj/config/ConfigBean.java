package com.wangfj.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * bean配置,RestTemplate负载均衡开启配置bean
 *
 * @author wangfj
 * @datetime 2019-05-30 21:50
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced //默认轮询（每个实例一次，按顺序来）方式负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
