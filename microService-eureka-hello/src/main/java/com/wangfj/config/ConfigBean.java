package com.wangfj.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
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

    /**
     * 自定义负债均衡规则，选择访问策略
     * 1、RoundRobinRule       轮询
     * 2、RandomRule           随机
     * 3、AvailabilityFilteringRule  会先过滤掉由多次访问故障而处于断路器跳闸状态的服务，还有并发的
     *                            连接数量超过阈值的服务，然后对剩余的服务列表按照轮询策略进行访问
     * 4、WeightedResponseTimeRule   根据平均响应时间计算所有服务的权重，响应时间越快的服务权重越大
     *                            被选中的概率越高。刚启动时如果统计信息不足，则使用RoundRobinRule(轮询)
     *                            策略，等统计信息足够，会切换到WeightedResponseTimeRule
     * 5、RetryRule            先按照RoundRobinRule(轮询)策略获取服务，如果获取服务失败则再指定时间内会
     *                      会进行重试，获取可用的服务
     * 6、BestAvailableRule 会先过滤掉由于多次访问故障而处于断路器跳闸状态的服务，然后和选择一个并发量最小的服务
     * 7、ZoneAvoidanceRule 默认规则，复合判断server所在区域的性能和server的可能性选择服务器
     * @return
     */
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
