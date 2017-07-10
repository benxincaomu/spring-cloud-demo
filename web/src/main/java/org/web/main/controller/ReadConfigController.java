package org.web.main.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadConfigController {
    @Value("${web.ip}")
    private String ip;

    @GetMapping("rest")
    public String rest() {
        return ip;
    }
}
