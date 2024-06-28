package com.demo.test.otherserver;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("demo-server")
public interface DemoServerInterface {
    @GetMapping("/v1/hello")
    public String demoHello() ;
}
