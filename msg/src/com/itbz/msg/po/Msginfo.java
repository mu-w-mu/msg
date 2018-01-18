package com.itbz.msg.po;

import java.util.Date;

public class Msginfo {
	private Integer msgid;
	private String title;
	private String msgcontent;
	private Integer state;
	private Date createtime;
	private Integer sendfrom;
	private Integer sendto;
	
	
	public Msginfo() {
		// TODO Auto-generated constructor stub
	}


	public Msginfo(Integer msgid, String title, String msgcontent,
			Integer state, Date createtime, Integer sendfrom, Integer sendto) {
		super();
		this.msgid = msgid;
		this.title = title;
		this.msgcontent = msgcontent;
		this.state = state;
		this.createtime = createtime;
		this.sendfrom = sendfrom;
		this.sendto = sendto;
	}


	public Integer getMsgid() {
		return msgid;
	}


	public void setMsgid(Integer msgid) {
		this.msgid = msgid;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getMsgcontent() {
		return msgcontent;
	}


	public void setMsgcontent(String msgcontent) {
		this.msgcontent = msgcontent;
	}


	public Integer getState() {
		return state;
	}


	public void setState(Integer state) {
		this.state = state;
	}


	public Date getCreatetime() {
		return createtime;
	}


	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}


	public Integer getSendfrom() {
		return sendfrom;
	}


	public void setSendfrom(Integer sendfrom) {
		this.sendfrom = sendfrom;
	}


	public Integer getSendto() {
		return sendto;
	}


	public void setSendto(Integer sendto) {
		this.sendto = sendto;
	}


	@Override
	public String toString() {
		return "Msginfo [msgid=" + msgid + ", title=" + title + ", msgcontent="
				+ msgcontent + ", state=" + state + ", createtime="
				+ createtime + ", sendfrom=" + sendfrom + ", sendto=" + sendto
				+ "]";
	}
	
	
}
