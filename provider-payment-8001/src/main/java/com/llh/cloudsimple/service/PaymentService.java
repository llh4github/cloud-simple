package com.llh.cloudsimple.service;

import com.llh.cloudsimple.entity.Payment;

import java.util.Optional;

/**
 * PaymentService
 * <p>
 * CreatedAt: 2020-10-18 21:43
 *
 * @author llh
 */
public interface PaymentService {

    Payment createPayment(Payment payment);

    Optional<Payment> getById(Integer id);
}
