package com.Jason.service;

import com.Jason.dao.PaymentDao;
import com.Jason.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Author Jason
 * @Date 2022/5/2 14:23
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService{

    @Override
    public String paymentInfo_OK(Integer id) {
        return "线程池： "+Thread.currentThread().getName()+"paymentInfo_OK, id:  "+id;
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池： "+Thread.currentThread().getName()+"paymentInfo_Timeout, id:  "+id;
    }
}
