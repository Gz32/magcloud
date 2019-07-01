package com.magi.magconsumer.feign;

import org.springframework.stereotype.Component;

/**
 * Created by Heyukun on 2019/6/17.
 */
@Component
public class MagConsumerHystric implements MagConsumerService {

    @Override
    public String sayHi(String name) {
        return "sorry " + name + ", hi service call failed.";
    }
}
