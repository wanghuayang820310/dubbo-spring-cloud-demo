package com.springcloud.dubbo_consumer.service;

import com.springcloud.dubbo_api.service.HelloService;
import com.springcloud.dubbo_api.service.ProductService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @Classname ConsumerService
 * @Description TODO
 * @Date 2020-10-31 9:48
 * @Created by why
 */
@Service
public class ConsumerService {
    @Reference
    private HelloService helloService1;
    @Reference
    private ProductService productService;
    public String getname(String name){
        System.out.println(name);
        return  helloService1.hello(name)+productService.productname(name);
    }
}
