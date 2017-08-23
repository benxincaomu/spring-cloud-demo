package org.rpc.client.main.controller;

import javax.annotation.Resource;

import org.rpc.client.main.service.TestService;
import org.sft.commons.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCotroller {
    @Autowired
    private TestService testService;

    @Resource
    private TestService serviceHytrix;

    @GetMapping("result")
    public String getResult(){
        return testService.service();
    }

    @GetMapping("result1")
    public String getResult1(){
        return serviceHytrix.service();
    }

    @PostMapping("upload")
    public String upload(String name){
        return serviceHytrix.upload(name);
    }

    @GetMapping("save")
    public User save(User user){
        return serviceHytrix.save(user);
    }

}
