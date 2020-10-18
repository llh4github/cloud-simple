package com.llh.cloudsimple.service.impl;

import com.llh.cloudsimple.dao.PaymentDao;
import com.llh.cloudsimple.entity.Payment;
import com.llh.cloudsimple.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * PaymentServiceImpl
 * <p>
 * CreatedAt: 2020-10-18 21:46
 *
 * @author llh
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    @Override
    public Payment createPayment(Payment payment) {
        return paymentDao.save(payment);
    }

    @Override
    public Optional<Payment> getById(Integer id) {
        return paymentDao.findById(id);
    }
}
