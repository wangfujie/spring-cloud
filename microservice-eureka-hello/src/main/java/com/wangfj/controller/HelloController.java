package com.wangfj.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * <li>文件名称: HelloController</li>
 * <li>文件描述: DESCRIPTION</li>
 * <li>版权所有: 版权所有© 2019</li>
 * <li>公    司: 勤智数码科技股份有限公司</li>
 * <li>内容摘要: 无</li>
 * <li>其他说明: 无</li>
 * <li>完成日期: 2019-05-07 18:13</li>
 * <li>修改记录: 无</li>
 *
 * @author wangfj
 * @version 1.0.0
 * @email wangfj@chinawiserv.com
 */
@RestController
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index(){
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/hello, host" + instance.getHost());
        logger.info("/hello, service_id" + instance.getServiceId());
        return "Hello World";
    }
}
