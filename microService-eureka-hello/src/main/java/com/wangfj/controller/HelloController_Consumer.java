package com.wangfj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * rest微服务负载均衡接口
 *
 * @author wangfj
 * @datetime 2019-05-30 21:54
 */
@RestController
public class HelloController_Consumer {

    private static final String REST_URL_PREFIX = "http://hello-service";


    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/hello")
    public String hello(){
        return restTemplate.getForObject(REST_URL_PREFIX + "/hello", String.class);
    }
}
