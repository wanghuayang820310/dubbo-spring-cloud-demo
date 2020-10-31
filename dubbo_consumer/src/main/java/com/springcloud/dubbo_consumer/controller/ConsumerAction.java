package com.springcloud.dubbo_consumer.controller;

import com.springcloud.dubbo_consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname ConsumerAction
 * @Description TODO
 * @Date 2020-10-31 9:50
 * @Created by why
 */
@RestController
public class ConsumerAction {
    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/consumer")
    public String ttt(){
        return consumerService.getname("ttt");
    }
}
