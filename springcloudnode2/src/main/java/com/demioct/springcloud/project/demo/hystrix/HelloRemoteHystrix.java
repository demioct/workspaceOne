package com.demioct.springcloud.project.demo.hystrix;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.demioct.springcloud.project.demo.feign.HelloRemote;

@Component
public class HelloRemoteHystrix implements HelloRemote{

	@Override
	public String hello2(@RequestParam(value = "name") String name) {
		return "hello" +name+", this messge send failed ";
	}

}
