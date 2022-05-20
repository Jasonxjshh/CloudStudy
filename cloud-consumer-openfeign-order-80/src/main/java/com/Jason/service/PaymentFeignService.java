package com.Jason.service;

import com.Jason.entity.CommonResult;
import com.Jason.entity.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Jason
 * @Date 2022/5/19 15:58
 */
@Component
@FeignClient(value = "cloud-provider-payment-service")
@RequestMapping("/payment")
public interface PaymentFeignService {
    @GetMapping("/create")
    public CommonResult create(Payment payment);


    @GetMapping("/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id);


    @GetMapping("/feign/timeout")
    public String paymentFeignTimeout();

}
