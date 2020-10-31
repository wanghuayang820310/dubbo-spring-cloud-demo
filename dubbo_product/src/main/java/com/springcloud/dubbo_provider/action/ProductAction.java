package com.springcloud.dubbo_provider.action;

import com.springcloud.dubbo_provider.service.Productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname ProductAction
 * @Description TODO
 * @Date 2020-10-31 10:17
 * @Created by why
 */
@RestController
public class ProductAction {
    @Autowired
    private Productservice productservice;
    @GetMapping("/product")
    public String getname(){
        return productservice.productname("111");
    }
}
