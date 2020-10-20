package com.llh.cloudsimple.model;

import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * Payment
 * <p>
 * CreatedAt: 2020-10-19 22:40
 *
 * @author llh
 */
@Data
@NoArgsConstructor
public class Payment {

    private Integer id;
    /**
     * 支付序列号。
     * <p>
     * 意思意思下。
     */
    private String seialNumber;
}
