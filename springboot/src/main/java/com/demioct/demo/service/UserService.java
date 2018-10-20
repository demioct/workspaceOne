package com.demioct.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demioct.demo.dao.UserDao;
import com.demioct.demo.model.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class UserService {

	@Autowired
	UserDao userDao;
	
	public PageInfo<User> getUserList(Map<String, String> paramMap){
		PageHelper.startPage(1,10);
		List<User> list = userDao.getUserList(paramMap);
		PageInfo<User> pageInfo = new PageInfo<User>(list);
		return pageInfo;
	}
}
