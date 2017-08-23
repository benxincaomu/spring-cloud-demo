package org.rpc.client.main.service;


import org.sft.commons.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("service-0")
public interface TestService {
    @RequestMapping(value="service",method= {RequestMethod.GET})
    public String service();
    @RequestMapping(value="upload",method= {RequestMethod.POST})
    public String upload(@RequestParam("name")String  name);
    
    @RequestMapping(value="save",method= {RequestMethod.POST})
    public User save(@RequestBody User user);
}
