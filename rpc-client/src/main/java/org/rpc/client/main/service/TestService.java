package org.rpc.client.main.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.netflix.ribbon.proxy.annotation.Http.HttpMethod;

@FeignClient("service-0")
public interface TestService {
    @RequestMapping(value="service",method= {RequestMethod.GET})
    public String service();
}
