package com.eurekuclient2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;


@RestController
public class testController {

    @Value("${server.port}")
    String port;
    @GetMapping("hello")
    public String sayhello(@RequestParam(value = "name" ,defaultValue = "bigsai")String name) throws UnknownHostException {
        return "hello " + name + " ,我的端口来自于:" + port+"本机的IP = " + InetAddress.getLocalHost();
    }
}
