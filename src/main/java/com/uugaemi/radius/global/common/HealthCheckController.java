package com.uugaemi.radius.global.common;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
    @RequestMapping("/")
    public String reply() {
        return "OK";
    }
}
