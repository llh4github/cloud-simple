package com.llh.cloudsimple;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Payment8001
 * <p>
 * CreatedAt: 2020-10-18 20:05
 *
 * @author llh
 */
@SpringBootApplication
@MapperScan("com.llh.*.dao")
@EnableEurekaClient
public class Payment8001 {

    public static void main(String[] args) {
        SpringApplication.run(Payment8001.class, args);
    }
}
