package com.llh.cloudsimple.cotroller;

import com.llh.cloudsimple.entity.JsonResult;
import com.llh.cloudsimple.model.Payment;
import com.llh.cloudsimple.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * PaymentController
 * <p>
 * CreatedAt: 2020-10-18 21:48
 *
 * @author llh
 */
@RestController
@RequestMapping("payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @PostMapping("add")
    public JsonResult add(@RequestBody Payment payment) {
        Payment entity = paymentService.createPayment(payment);
        return JsonResult.ok(entity);
    }

    @GetMapping("{id}")
    public JsonResult getById(@PathVariable Integer id) {
        Optional<Payment> optional = paymentService.getById(id);
        return JsonResult.ok(optional, port);
    }
}
