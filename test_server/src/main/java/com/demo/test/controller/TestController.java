package com.demo.test.controller;

import com.demo.test.otherserver.DemoServerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2")
public class TestController {
    @Autowired
    DemoServerInterface demoServerInterface;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String getHello() {
        return "hello this is test server hello";
    }

    @RequestMapping(value = "/demohello",method = RequestMethod.GET)
    public String getDemoHello() {
        return demoServerInterface.demoHello();
    }
}
