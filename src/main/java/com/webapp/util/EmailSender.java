package com.webapp.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSender {
 
	@Autowired
	private JavaMailSender javaMailSender;
	public void sendEmail(String to,String subject,String text) {
		SimpleMailMessage ms = new SimpleMailMessage();
		ms.setTo(to);
		ms.setSubject(subject);
		ms.setText(text);
		javaMailSender.send(ms);
	}
}
