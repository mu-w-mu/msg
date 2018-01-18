package com.itbz.msg.dao;

import java.util.List;

import com.itbz.msg.po.Msginfo;
import com.itbz.msg.po.User;

public interface MsginfoDao {

	
	List<Msginfo> querySendMsg(User user);

	List<Msginfo> queryReceiveMsg(User user);

	Integer saveSendMsg(Msginfo msginfo);

	int deleteMsg(Integer msgid);

}
