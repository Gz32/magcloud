package com.magi.magconsumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigHiControler {

    @Value("${foo}")
    private String foo;

    @RequestMapping(value = "/config/hi")
    public String hi() {
        return this.foo;
    }
}
