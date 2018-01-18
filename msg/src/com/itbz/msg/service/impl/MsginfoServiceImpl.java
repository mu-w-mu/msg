package com.itbz.msg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbz.msg.dao.MsginfoDao;
import com.itbz.msg.po.Msginfo;
import com.itbz.msg.po.User;
import com.itbz.msg.service.MsginfoService;

@Service
public class MsginfoServiceImpl implements MsginfoService {

	@Autowired
	private MsginfoDao md;
	@Override
	public List<Msginfo> querySendMsg(User user) {
		// TODO Auto-generated method stub
		return md.querySendMsg(user);
	}

	@Override
	public List<Msginfo> queryReceiveMsg(User user) {
		// TODO Auto-generated method stub
		return md.queryReceiveMsg(user);
	}

	@Override
	public Integer saveSendMsg(Msginfo msginfo) {
		// TODO Auto-generated method stub
		return md.saveSendMsg(msginfo);
	}

	@Override
	public int deleteMsg(Integer msgid) {
		// TODO Auto-generated method stub
		return md.deleteMsg(msgid);
	}

}
