package com.hystrixdemo.Interface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "SERVICE-HELLO",fallback = productClientHyctric.class)
public interface productClient {

    @GetMapping("hello")
    String sayhello(@RequestParam(value = "name",defaultValue = "bigsai")String name);
}
