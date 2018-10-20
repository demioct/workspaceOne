package com.demioct.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demioct.demo.model.User;
import com.demioct.demo.service.UserService;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("api/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping("getUserList")
	public PageInfo<User> getUserList(HttpServletRequest request){
		String sdDate = request.getParameter("sdDate");
		Map<String, String> paramMap = new HashMap<>();
		paramMap.put("sdDate", sdDate);
		PageInfo<User> list = userService.getUserList(paramMap);
		return list;
	}
}
