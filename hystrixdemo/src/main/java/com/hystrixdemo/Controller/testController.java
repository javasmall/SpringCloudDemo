package com.hystrixdemo.Controller;


import com.hystrixdemo.Interface.productClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @Autowired(required = false)
    productClient productClient;
    @GetMapping("sayhello")
    public String sayhello(String name)
    {
        return productClient.sayhello(name);
    }
}
