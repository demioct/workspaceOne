package com.demioct.springcloud.project.demo.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demioct.springcloud.project.demo.hystrix.HelloRemoteHystrix;

@FeignClient(name= "SPRINGCLOUDSERVER",fallback=HelloRemoteHystrix.class)
public interface HelloRemote {

	@RequestMapping(value = "/hello")
    public String hello2(@RequestParam(value = "name") String name);
}
