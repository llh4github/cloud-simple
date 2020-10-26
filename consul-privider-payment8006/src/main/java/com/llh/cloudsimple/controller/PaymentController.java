package com.llh.cloudsimple.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * PaymentController
 * <p>
 * CreatedAt: 2020-10-26 22:00
 *
 * @author llh
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String port;

    @GetMapping("payment/consul")
    public String payment() {
        return "Spring cloud with consul " + port + "  " + LocalDateTime.now();
    }
}
