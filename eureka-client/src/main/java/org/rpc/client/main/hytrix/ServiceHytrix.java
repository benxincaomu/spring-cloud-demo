package org.rpc.client.main.hytrix;

import javax.annotation.Resource;

import org.rpc.client.main.service.TestService;
import org.sft.commons.entity.User;
import org.springframework.stereotype.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service("serviceHytrix")
public class ServiceHytrix implements TestService {
    @Resource
    private TestService testService;

    @Override
    @HystrixCommand(groupKey = "aas", fallbackMethod = "fallback")
    public String service(){
        System.out.println("==============================================================");
        return testService.service();
    }

    @Override
    @HystrixCommand(groupKey = "aas", fallbackMethod = "fallback")
    public String upload(String name){
        return testService.upload(name);
    }
    @Override
    public User save(User user){
        return testService.save(user);
    }

    public String fallback(){
        System.out.println("==========================fallback====================================");
        return "fallback";
    }

    public String fallback(String name){
        System.out.println("==========================" + name + "====================================");
        return "fallback";
    }

   
}
