package org.base.service.main.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestServiceController {

    private final Logger log=LogManager.getLogger(this.getClass()); 
    @GetMapping("service")
    public String service() {
        log.info("我被调用了");
        return "This is a service";
    }

}
