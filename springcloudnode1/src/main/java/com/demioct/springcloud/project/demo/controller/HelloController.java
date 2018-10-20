package com.demioct.springcloud.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demioct.springcloud.project.demo.feign.HelloRemote;

@RestController
public class HelloController {
	
	@Autowired
    HelloRemote helloRemote;
	
	@RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }

}
