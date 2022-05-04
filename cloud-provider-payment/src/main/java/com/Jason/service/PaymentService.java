package com.Jason.service;

import com.Jason.dao.PaymentDao;
import com.Jason.entity.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Jason
 * @Date 2022/5/2 14:19
 * @Version 1.0
 */
@Service
public interface PaymentService {

    public int create(Payment payment);

    public Payment selectPaymentById(@Param("id") Long id);
}
