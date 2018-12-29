package com.xinghai29.logandexception.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    private Logger LOG = LoggerFactory.getLogger(HelloWorld.class);
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String index(@RequestParam String name) {
        LOG.info("#index#begin");
        return "hello" + name;
    }
}
