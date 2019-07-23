package com.covalense.emp.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.covalense.emp.bean.EmployeeInfoBean;
import com.covalense.emp.bean.EmployeeOtherInfoBean;



public class PrepareDataUtil {

	private PrepareDataUtil() {}
	public static EmployeeInfoBean prepareData(int id) {
		
		EmployeeInfoBean empinfo=new EmployeeInfoBean();
		empinfo.setId(id);
		empinfo.setName("vineetha");
		empinfo.setAge(67);
		empinfo.setGender("female");
		empinfo.setSalary(22000);
		empinfo.setPhone(1231231);

		SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd");
		//Date date=format.parse("2013-09-08");
		Date date=null;
		try {
			date=format.parse("2013-09-08");
		}catch(ParseException e) {
			e.printStackTrace();
		}
		empinfo.setDob(date);
		empinfo.setAccount_number(224324);
		empinfo.setDesignation("hr");
		empinfo.setPhone(242);
		empinfo.setEmail("fdszfs");
		empinfo.setGender("female");
		empinfo.setSalary(23423523);


		EmployeeOtherInfoBean otherinfo=new EmployeeOtherInfoBean();
		
		otherinfo.setAdhar(13131);
		otherinfo.setBlood_grp("o+ve");
		otherinfo.setEmergency_contact_person("lol");
		otherinfo.setEmergency_contact_number(769767);
		otherinfo.setFather_nm("lpl");
		otherinfo.setId(id);
		otherinfo.setMother_nm("kyi");
		otherinfo.setNationality("india");
		otherinfo.setSpouse_nm("uyhn ");
		otherinfo.setReligion("hindu");
		otherinfo.setPan_no("pan4535");
		otherinfo.setPassport("passport24234");
		
		empinfo.setOtherInfo(otherinfo);
		return empinfo;

	}
	
}
