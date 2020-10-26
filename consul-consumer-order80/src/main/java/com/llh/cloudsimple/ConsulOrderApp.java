package com.llh.cloudsimple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ConsulOrderApp
 * <p>
 * CreatedAt: 2020-10-26 22:07
 *
 * @author llh
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulOrderApp {
    public static void main(String[] args) {
        SpringApplication.run(ConsulOrderApp.class, args);
    }
}
