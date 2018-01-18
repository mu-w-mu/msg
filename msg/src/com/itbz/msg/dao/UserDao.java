package com.itbz.msg.dao;

import com.itbz.msg.po.User;


public interface UserDao {

	User queryByCondition(User user);

	Integer saveUser(User user);

}
