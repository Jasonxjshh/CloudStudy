package com.Jason.controller;


import com.Jason.entity.CommonResult;
import com.Jason.entity.Payment;
import com.Jason.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

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

    @GetMapping("/create")
    public CommonResult create(Payment payment) {
        int result = paymentService.create(payment);
        log.info("插入数据的ID:" + payment.getId());
        log.info("插入结果：" + result);
        if (result > 0) {
            return new CommonResult(200, "插入数据成功, serverPort:"+serverPort, result);
        } else {
            return new CommonResult(444, "插入数据失败, serverPort:"+serverPort, null);
        }
    }

    @GetMapping("/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.selectPaymentById(id);
        log.info("***查询结果：" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询数据成功, serverPort:"+serverPort, payment);
        } else {
            return new CommonResult(444, "没有对应记录, serverPort:"+serverPort, null);
        }
    }


    @GetMapping("/feign/timeout")
    public String paymentFeignTimeout(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return serverPort;
    }

}
