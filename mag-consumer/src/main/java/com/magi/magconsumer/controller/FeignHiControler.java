package com.magi.magconsumer.controller;

import com.magi.magconsumer.feign.MagConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Heyukun on 2019/6/15.
 */
@RestController
public class FeignHiControler {

    @Autowired
    private MagConsumerService consumerService;

    @GetMapping(value = "/feign/hi")
    public String hi(@RequestParam(value = "name") String name) {
        // 像调用本地服务一样
        return consumerService.sayHi(name);
    }
}
