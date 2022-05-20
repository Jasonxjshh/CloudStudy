package com.Jason.service;

import org.springframework.stereotype.Service;

/**
 * @Author Jason
 * @Date 2022/5/2 14:19
 * @Version 1.0
 */
@Service
public interface PaymentService {

    public String paymentInfo_OK(Integer id);


    public String paymentInfo_Timeout(Integer id);
}
