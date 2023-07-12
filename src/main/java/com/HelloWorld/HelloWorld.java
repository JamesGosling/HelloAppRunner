package com.HelloWorld;

import java.time.Clock;
import java.time.format.DateTimeFormatter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    private static final String bootTime = DateTimeFormatter.ISO_INSTANT.format(Clock.systemUTC().instant());
    private int inv = 0;
    private static int instance = 0;
    private final int tin = instance++;
    @RequestMapping("/")
    public String index(){
        return bootTime+"\nInvocations: "+inv+++"\nInstance #: "+tin;
    }
}
