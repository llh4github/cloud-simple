package com.llh.cloudsimple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EurekaApp7002
 * <p>
 * CreatedAt: 2020-10-22 21:55
 *
 * @author llh
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApp7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApp7002.class, args);
    }
}
