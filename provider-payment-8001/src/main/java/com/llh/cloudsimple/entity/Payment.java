package com.llh.cloudsimple.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Payment
 * <p>
 * CreatedAt: 2020-10-18 21:00
 *
 * @author llh
 */
@Data
@NoArgsConstructor
@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 支付序列号。
     * <p>
     * 意思意思下。
     */
    private String seialNumber;
}
