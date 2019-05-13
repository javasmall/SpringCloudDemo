package com.hystrixdemo.Interface;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class productClientHyctric implements productClient {
    @Override
    public String sayhello(@RequestParam(value = "name",defaultValue = "bigsai")String name) {
        return "gg,服务被关了";
    }
}
