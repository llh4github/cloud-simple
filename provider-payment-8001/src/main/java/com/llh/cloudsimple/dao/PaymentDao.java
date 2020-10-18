package com.llh.cloudsimple.dao;

import com.llh.cloudsimple.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * PaymentDao
 * <p>
 * CreatedAt: 2020-10-18 21:31
 *
 * @author llh
 */
@Repository
public interface PaymentDao extends JpaRepository<Payment, Integer> {
}
