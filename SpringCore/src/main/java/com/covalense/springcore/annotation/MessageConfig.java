package com.covalense.springcore.annotation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import com.covalense.springcore.annotation.MessageBean;
@Configuration
public class MessageConfig {
@Bean

public MessageBean getMessageBean() {
	MessageBean messagebean=new MessageBean();
	messagebean.setMessage("hello world!!!!!");
	return messagebean;
}
}
