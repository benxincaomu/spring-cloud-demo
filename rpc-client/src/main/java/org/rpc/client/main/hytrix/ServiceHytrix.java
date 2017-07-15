package org.rpc.client.main.hytrix;

import javax.annotation.Resource;

import org.rpc.client.main.service.TestService;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service("serviceHytrix")
public class ServiceHytrix implements TestService {
    @Resource
    private TestService testService;

    @Override
    @HystrixCommand(groupKey="aas", fallbackMethod="fallback")
    public String service() {
        // TODO Auto-generated method stub
        System.out.println("==============================================================");
        return testService.service();
    }
    
    
    public String fallback() {
        System.out.println("==========================fallback====================================");
        return "fallback";
    }
    

}
