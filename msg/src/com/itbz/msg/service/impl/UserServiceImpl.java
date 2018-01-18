package com.itbz.msg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbz.msg.dao.UserDao;
import com.itbz.msg.po.User;
import com.itbz.msg.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao ud;
	@Override
	public User queryByCondition(User user) {
		// TODO Auto-generated method stub
		return ud.queryByCondition(user);
	}

	@Override
	public Integer saveUser(User user) {
		// TODO Auto-generated method stub
		return ud.saveUser(user);
	}

}
