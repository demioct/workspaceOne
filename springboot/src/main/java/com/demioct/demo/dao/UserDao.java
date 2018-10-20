package com.demioct.demo.dao;

import java.util.List;
import java.util.Map;

import com.demioct.demo.model.User;

public interface UserDao {

	public List<User> getUserList(Map<String, String> paramMap);
}
