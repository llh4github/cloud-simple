package com.llh.cloudsimple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EurekaApp7001
 * <p>
 * CreatedAt: 2020-10-22 21:34
 *
 * @author llh
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApp7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApp7001.class, args);
    }
}
