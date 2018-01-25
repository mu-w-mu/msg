package com.itbz.msg.controller;

import java.lang.annotation.Target;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.itbz.msg.po.Msginfo;
import com.itbz.msg.po.User;
import com.itbz.msg.service.MsginfoService;
import com.itbz.msg.service.UserService;
import com.itbz.msg.vo.MsgVo;



@Controller
public class MsginfoController {

	@Autowired
	private MsginfoService ms;
	@Autowired
	private UserService us;
	@RequestMapping("querySendMsg.action")
	public Object querySendMsg(HttpServletRequest request)
	{
		User user=(User) request.getSession().getAttribute("user");
		List<Msginfo> list=ms.querySendMsg(user);
		ModelAndView mav=new ModelAndView("sendmsg-view.jsp");
		mav.addObject("sendmsg", list);
		return mav;
	}
	
	@RequestMapping("queryReceiveMsg.action")
	public Object queryReceiveMsg(HttpServletRequest request)
	{
		User user=(User) request.getSession().getAttribute("user");
		List<Msginfo> list=ms.queryReceiveMsg(user);
		ModelAndView mav=new ModelAndView("receivemsg-view.jsp");
		mav.addObject("sendmsg", list);
		return mav;
	}
	
	@RequestMapping("sendMsg.action")
	@ResponseBody
	public Object sendMsg(@RequestParam("email") String email,@RequestParam("msgcontent") String msgcontent,@RequestParam("title") String title,HttpServletRequest request)
	{
		User user=(User) request.getSession().getAttribute("user");
		User sendto=us.queryByCondition(new User(null, null, null, email));
		MsgVo msgVo=new MsgVo();
		if(user!=null)
		{
			Integer result=ms.saveSendMsg(new Msginfo(null, title, msgcontent, null, new Date(), user.getId(), sendto.getId()));
			if(result>0)
			{
				msgVo.setStatus(1);
				msgVo.setMessage("send success");
			}
			else
			{
				msgVo.setStatus(0);
				msgVo.setMessage("send faild");
			}
		}
		else
		{
			msgVo.setStatus(0);
			msgVo.setMessage("send faild");
		}
		return msgVo;
	}
	
	@RequestMapping("deleteMsg.action")
	@ResponseBody
	public Object deleteMsg(@RequestParam("msgid") Integer msgid)
	{
		
		MsgVo msgVo=new MsgVo();
		if(ms.deleteMsg(msgid)>0)
		{
			msgVo.setStatus(1);
			msgVo.setMessage("delete success");
		}
		else
		{
			msgVo.setStatus(0);
			msgVo.setMessage("delete faild");
		}
		return msgVo;
	}
	
	@RequestMapping("viewMsg.action")
	@ResponseBody
	public Object viewMsg(@RequestParam("msgid") Integer msgid)
	{
		
		return null;
	}
}
