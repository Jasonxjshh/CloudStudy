package com.Jason.dao;

import com.Jason.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author Jason
 * @Date 2022/5/2 13:51
 * @Version 1.0
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment selectPaymentById(@Param("id") Long id);
}
