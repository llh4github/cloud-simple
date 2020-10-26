package com.llh.cloudsimple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * OrderController
 * <p>
 * CreatedAt: 2020-10-26 22:11
 *
 * @author llh
 */
@RestController
public class OrderController {
    private static final String URL = "http://consul-provider-payment";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("consumer/payment/consul")
    public String paymentInfo() {
        return restTemplate.getForObject(URL + "/payment/consul", String.class);
    }
}
