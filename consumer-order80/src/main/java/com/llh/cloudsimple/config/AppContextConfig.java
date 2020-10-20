package com.llh.cloudsimple.config;

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
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
