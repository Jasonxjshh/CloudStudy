package com.Jason.controller;

import com.Jason.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Jason
 * @Date 2022/5/20 17:31
 */
@RestController
@Slf4j
public class OrderHystrixController {
    @Autowired
    PaymentHystrixService paymentHystrixService;


    @GetMapping("consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable Integer id){
        return paymentHystrixService.paymentInfo_OK(id);
    }

    @GetMapping("consumer/payment/hystrix/timeout/{id}")
    public String paymentInfo_Timeout(@PathVariable Integer id){
        return paymentHystrixService.paymentInfo_Timeout(id);
    }
}
