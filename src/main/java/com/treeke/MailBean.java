package com.treeke;

import java.io.Serializable;

public class MailBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6937007142051174081L;
	private String recipient;   //邮件接收人
	private String subject; //邮件主题
	private String content; //邮件内容
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "MailBean [recipient=" + recipient + ", subject=" + subject + ", content=" + content + "]";
	}
	public MailBean(String recipient, String subject, String content) {
		super();
		this.recipient = recipient;
		this.subject = subject;
		this.content = content;
	}
	public MailBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
