package com.covalense.designpattens.builder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {

	public static void main(String[] args) throws ParseException {
		MyImmutableClass immutableclass=null;
		
		immutableclass=new MyImmutableClass("vini",20,9334567890L);
		log.info("name"+immutableclass.getName());
		log.info("age"+immutableclass.getName());
		log.info("phone"+immutableclass.getName());
		
		immutableclass=new MyImmutableClass("geetha",20,908745890L);
		log.info("name"+immutableclass.getName());
		log.info("age"+immutableclass.getName());
		log.info("phone"+immutableclass.getName());
		
		SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd");
		Date date=format.parse("2013-09-08");
		
		EmployeeInfoData data=new EmployeeInfoData(13,"vineesha",20,"female",
				345.890,790055554,date,424231,
				"abc@gmail.com","tester",date,3445,6788);
		log.info("data:"+data.toString());
		
		EmployeeInfoData2 data2= new EmployeeInfoData2 
				.EmployeeDataTwoBuilder()
				.id(123)
				.name("jithu")
				.age(20)
				.gender("male")
				.salary(2390777.89)
				.phone(34324343)
				.joining_date(date)
				.account_number(343546)
				.email("ert@gmail.com")
				.designation("soft_eng")
				.dob(date)
				.dept_id(3535)
				.mngr_id(8685)
				.build();
		log.info("data:"+data2.toString());
		
		EmployeeInfoData3 data3=new EmployeeInfoData3
				.EmployeeInfoData3Builder()
				.id(123)
				.name("jithu")
				.age(20)
				.gender("male")
				.salary(2390777.89)
				.phone(34324343)
				.joining_date(date)
				.account_number(343546)
				.email("ert@gmail.com")
				.designation("soft_eng")
				.dob(date)
				.dept_id(3535)
				.mngr_id(8685)
				.build();
		log.info("data:"+data3.toString());
		
	}
}
