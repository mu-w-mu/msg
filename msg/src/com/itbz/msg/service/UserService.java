package com.itbz.msg.service;

import com.itbz.msg.po.User;

public interface UserService {

	User queryByCondition(User user);

	Integer saveUser(User user);

}
