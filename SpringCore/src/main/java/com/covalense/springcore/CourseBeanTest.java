package com.covalense.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.springcore.beans.CourseBean;

import lombok.extern.java.Log;
@Log
public class CourseBeanTest {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("course.xml");
		
		CourseBean courseBean=(CourseBean)applicationContext.getBean("CourseBean");
		log.info("id"+courseBean.getCourseId());
		log.info("Cousename"+courseBean.getCourseName());
		log.info("Faculty"+courseBean.getFaculty());
	}
}
