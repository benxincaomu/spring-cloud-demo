package org.base.service.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestServiceController {
    
    @GetMapping("service")
    public String service() {
        return "This is a service";
    }

}
