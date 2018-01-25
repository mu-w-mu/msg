package com.itbz.ego.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itbz.ego.service.TUserService;


@Controller
public class TUserController {
	@Autowired
	private TUserService ts;
	
	@RequestMapping("getUser.action")
	public Object getUserById()
	{
		return null;
//		return ts.getUserById((long)1);
	}
}
