package com.covalense.assessment.returnlist;

import java.util.List;

import lombok.extern.java.Log;
@Log
public class StudentBeanTest {
	public static void main(String[] args) {

		StudentBean student1 = new StudentBean("lohitha", 67, 6, 'F');
		StudentBean student2 = new StudentBean("harsha", 90, 7, 'F');
		StudentBean student3 = new StudentBean("roshan", 56, 8, 'M');

		Validation validate = new Validation();
		List<StudentBean> list = validate.check(1);
		list.add(student1);
		list.add(student2);
		list.add(student3);

		for (StudentBean studentBean : list) {
			log.info("" + studentBean);
		}

	}
}
