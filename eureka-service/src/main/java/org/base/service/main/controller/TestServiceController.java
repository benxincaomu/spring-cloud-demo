package org.base.service.main.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.sft.commons.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

@RestController
public class TestServiceController {

    private final Logger log=LogManager.getLogger(this.getClass()); 
    @GetMapping("service")
    public String service() {
        log.info("我被调用了");
        return "This is a service";
    }
    
    @PostMapping("upload")
    public String  upload(String name) {
        
        return "The name is "+name;
    }
    @PostMapping("save")
    public User saveUser(HttpServletRequest request,@RequestBody User user) {
        System.out.println(JSONObject.toJSONString(request.getParameterMap()));
        System.out.println(JSONObject.toJSONString(user));
        return user;
    }

}
