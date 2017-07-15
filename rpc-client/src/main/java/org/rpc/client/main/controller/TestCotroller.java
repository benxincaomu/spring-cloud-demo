package org.rpc.client.main.controller;


import javax.annotation.Resource;

import org.rpc.client.main.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCotroller {
    @Resource
    private TestService testService;
    @GetMapping("result")
    public String getResult() {
        return testService.service();
    }

}
