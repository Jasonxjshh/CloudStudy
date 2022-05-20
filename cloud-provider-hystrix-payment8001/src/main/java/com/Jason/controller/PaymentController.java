package com.Jason.controller;


import com.Jason.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * @Author Jason
 * @Date 2022/5/4 15:19
 * @Version 1.0
 */

@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;



    @GetMapping("/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable Integer id){
        String result = paymentService.paymentInfo_OK(id);
        log.info("=== result ===: "+ result);
        return result;
    }

    @GetMapping("/hystrix/timeout/{id}")
    public String paymentInfo_Timeout(@PathVariable Integer id){
        String result = paymentService.paymentInfo_Timeout(id);
        log.info("=== result ===: "+ result);
        return result;
    }

}
