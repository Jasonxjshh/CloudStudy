package com.Jason.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author Jason
 * @Date 2022/5/16 18:00
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;


    @RequestMapping("/payment/zk")
    public String testZookeeper(){
        return "springcloud with zookeeper: "+ serverPort + "\t" + UUID.randomUUID().toString();
    }
}
