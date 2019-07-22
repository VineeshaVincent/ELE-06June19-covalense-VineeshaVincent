package com.covalense.springcore.annotationTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springcore.annotation.MessageBean;
import com.covalense.springcore.annotation.MessageConfig;


public class MessageTest {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(MessageConfig.class);
		
		((ConfigurableApplicationContext)context).registerShutdownHook();
		
		
		MessageBean messagebean=context.getBean(MessageBean.class);
		MessageBean messagebean1=context.getBean(MessageBean.class);
		
		System.out.println("msg1: "+messagebean.getMessage());
		System.out.println("msg2: "+messagebean1.getMessage());
		
		messagebean1.setMessage("Welcome TO Spring!!!!!");
		System.out.println("msg1: "+messagebean.getMessage());
		System.out.println("msg2: "+messagebean1.getMessage());
		
		//((ConfigurableApplicationContext)context).close();
		
	}
}
