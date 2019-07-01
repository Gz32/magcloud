package com.magi.magconsumer.ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HiService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "errService")
    public String hiService(String name) {
        // 调用服务, service-producer为注册的服务名称，LoadBalancerInterceptor会拦截调用并根据服务名找到对应的服务
        return restTemplate.getForObject("http://eureka-hi/hi?name=" + name, String.class);
    }

    public String errService(String name) {
        return "sorry " + name + ", hi error.";
    }
}
