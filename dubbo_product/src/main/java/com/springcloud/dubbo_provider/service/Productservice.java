package com.springcloud.dubbo_provider.service;

import com.springcloud.dubbo_api.service.ProductService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Classname ProductService
 * @Description TODO
 * @Date 2020-10-31 10:17
 * @Created by why
 */
@Service
public  class Productservice implements ProductService {


@Override
    public String productname(String pname) {
    System.out.println(pname);
    return "hello "+pname;
    }
}
