package com.llh.cloudsimple.dao;

import com.llh.cloudsimple.model.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Optional;


/**
 * PaymentDao
 * <p>
 * CreatedAt: 2020-10-18 21:31
 *
 * @author llh
 */
@Mapper
public interface PaymentDao {

    int save(Payment payment);

    Payment findById(@Param("id") Integer id);
}
