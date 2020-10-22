package com.llh.cloudsimple.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * AppContextConfig
 * <p>
 * CreatedAt: 2020-10-19 21:58
 *
 * @author llh
 */
@Configuration
public class AppContextConfig {

    @Bean
    // 开启负载均衡。
    // 才能通过微服务名去调用某个微服务实例，即使仅有一个实例
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
