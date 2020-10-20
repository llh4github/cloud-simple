package com.llh.cloudsimple.controller;

import com.llh.cloudsimple.entity.JsonResult;
import com.llh.cloudsimple.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * OrderController
 * <p>
 * CreatedAt: 2020-10-19 22:00
 *
 * @author llh
 */
@RestController
@RequestMapping("consumer/order")
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;

    public static final String PAYMENT_URL = "http://localhost:8001";

    @PostMapping("/create")
    public JsonResult create(@RequestBody Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/add", payment, JsonResult.class);
    }

    @GetMapping("{id}")
    public JsonResult get(@PathVariable Integer id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/" + id, JsonResult.class);
    }
}
