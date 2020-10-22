package com.llh.cloudsimple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * OrderApp80
 * <p>
 * CreatedAt: 2020-10-19 21:54
 *
 * @author llh
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderApp80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderApp80.class, args);
    }
}
