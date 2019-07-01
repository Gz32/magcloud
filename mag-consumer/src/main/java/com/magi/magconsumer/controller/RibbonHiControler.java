package com.magi.magconsumer.controller;

import com.magi.magconsumer.ribbon.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonHiControler {

    @Autowired
    private HiService hiService;

    @GetMapping(value = "/ribbon/hi")
    public String hi(@RequestParam(value = "name") String name) {
        return hiService.hiService(name);
    }
}
