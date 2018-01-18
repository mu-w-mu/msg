package com.itbz.msg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.itbz.msg.po.User;
import com.itbz.msg.service.UserService;
import com.itbz.msg.vo.MsgVo;



@Controller
@SessionAttributes({"user"})
public class UserController {
	
	@Autowired
	private UserService us;
	@RequestMapping("login.action")
	public Object login(@RequestParam("username") String username,@RequestParam("password") String password,ModelMap map)
	{
		User user=new User(null, username, password, null);
		User user1=us.queryByCondition(user);
		if(user1!=null)
		{
			map.addAttribute("user", user1);
			return "";
		}
		else
		{
			ModelAndView mdv=new ModelAndView("redirect:login.jsp");
			mdv.addObject("msg", "login faild");
			return mdv;
		}
	}
	
	@RequestMapping("register.action")
	public Object register(User user)
	{
		Integer result=us.saveUser(user);
		if(result>0)
		{
			return "success";
		}else
		{
			return "faild";
		}
	}
	
	@RequestMapping("validata.action")
	@ResponseBody
	public Object validata(@RequestParam("username") String username)
	{
		User user=new User(null,username,null,null);
		User user1=us.queryByCondition(user);
		MsgVo msgVo=new MsgVo();
		if(user1==null)
		{
			msgVo.setStatus(1);
			msgVo.setMessage("此用户名可用");
		}
		else
		{
			msgVo.setStatus(0);
			msgVo.setMessage("此用户名已存在");
		}
		return msgVo;
	}
	
	@RequestMapping("queryUser.action")
	@ResponseBody
	public Object queryUser(@RequestParam("id") Integer id)
	{
		return us.queryByCondition(new User(id, null, null, null));
	}
}
