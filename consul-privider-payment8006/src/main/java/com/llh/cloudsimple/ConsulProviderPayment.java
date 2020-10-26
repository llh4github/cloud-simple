package com.llh.cloudsimple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ConsulProviderPayment
 * <p>
 * CreatedAt: 2020-10-26 21:53
 *
 * @author llh
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulProviderPayment {
    public static void main(String[] args) {
        SpringApplication.run(ConsulProviderPayment.class, args);
    }
}
