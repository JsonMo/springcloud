package com.testcloud.demo.controller;

import com.testcloud.demo.properties.ConfigInfoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

    @Autowired
    private ConfigInfoProperties configInfoProperties;

    @RequestMapping("/test")
    public String test(){

            return  configInfoProperties.getConfig();
    }
}
