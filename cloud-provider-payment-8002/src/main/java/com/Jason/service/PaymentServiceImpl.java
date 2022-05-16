package com.Jason.service;

import com.Jason.dao.PaymentDao;
import com.Jason.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Jason
 * @Date 2022/5/2 14:23
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment selectPaymentById(Long id) {
        return paymentDao.selectPaymentById(id);
    }
}
