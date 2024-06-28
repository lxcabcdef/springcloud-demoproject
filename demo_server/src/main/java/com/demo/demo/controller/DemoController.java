package com.demo.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class DemoController {

    @Value("${code.testcode}")
    private String testcode;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String getHello() {
        return "hello this is demo server hello";
    }

    @RequestMapping(value = "/testcode",method = RequestMethod.GET)
    public String getTestCode() {
        return testcode;
    }
}
