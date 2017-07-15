package org.rpc.client.main.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("service-0")
public interface TestService {
    @GetMapping("service")
    public String service();
}
