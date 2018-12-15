package com.treeke;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailDemoApp implements ApplicationRunner{
	
	@Value("${spring.mail.username}")
	private String mailSender;
	
	@Value("${recevier}")
	private String recevier;
	
	@Autowired
	private EmailSend emailSend;
	
	public static void main(String[] args) {
		SpringApplication.run(EmailDemoApp.class, args);
	}

	public void run(ApplicationArguments arg0) throws Exception {
		
		MailBean mailBean = new MailBean();
		mailBean.setRecipient(recevier);
		mailBean.setSubject("测试");
		mailBean.setContent(new Date().toLocaleString());
		
		//emailSend.sendSimpleMail();
		emailSend.sendHTMLMail(mailBean);
		System.out.println("邮件发送成功");
		
		
	}

}
