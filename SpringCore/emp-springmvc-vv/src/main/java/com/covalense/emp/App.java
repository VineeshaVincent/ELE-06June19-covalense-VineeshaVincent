package com.covalense.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import com.covalense.emp.beans.manytomany.TrainingInfoBean;
import com.covalense.emp.beans.manytoone.EmployeeAddressInfoBean;
import com.covalense.emp.beans.manytoone.EmployeeAddressPKBean;
import com.covalense.emp.beans.manytoone.EmployeeEducationalInfoBean;
import com.covalense.emp.beans.manytoone.EmployeeEducationalPKBean;
import com.covalense.emp.beans.manytoone.EmployeeExperienceInfoBean;
import com.covalense.emp.beans.manytoone.EmployeeExperiencePKBean;
import com.covalense.emp.beans.model.HibernateImpl;
import com.covalense.emp.beans.onetoone.EmployeeOtherInfoBean;
import com.covalense.emp.beans.primary.EmployeeInfoBean;

public class App {

	/*
	 * public static void main( String[] args ) { EmployeeInfoBean bean=new
	 * EmployeeInfoBean(); bean.setId(103); bean.setName("yanusha");
	 * bean.setAge(29); bean.setDesignation("manager");
	 * bean.setAccount_number(239000);
	 * 
	 * bean.setDept_id(10); bean.setMngr_id(100);
	 * bean.setEmail("yanusha@gmail.com"); bean.setPassword("yanusha");
	 * bean.setSalary(123000); bean.setGender("female"); bean.setPhone(90877);
	 * SimpleDateFormat format= new SimpleDateFormat("yyyy-mm-dd"); Date date; Date
	 * dob; try { date=format.parse("2019-02-01"); dob=format.parse("1998-08-01");
	 * bean.setDob(dob); bean.setJoining_date(date); } catch(ParseException e){
	 * e.printStackTrace(); }
	 * 
	 * 
	 * EmployeeInfoBean bean2=new EmployeeInfoBean(); bean2.setId(104);
	 * bean2.setName("pooja"); bean2.setAge(50); bean.setDept_id(1);
	 * bean.setDesignation("tester");
	 * 
	 * EmployeeInfoBean bean3=new EmployeeInfoBean(); bean3.setId(105);
	 * bean3.setName("radhika"); bean2.setAge(20); bean.setDept_id(3);
	 * bean.setDesignation("supporter");
	 * 
	 * EmployeeInfoBean bean4=new EmployeeInfoBean(); bean4.setId(106);
	 * bean4.setName("lohin"); bean2.setAge(30); bean.setDept_id(2);
	 * bean.setDesignation("assistent");
	 * 
	 * TrainingInfoBean trainingInfoBean=new TrainingInfoBean();
	 * trainingInfoBean.setCourse_id(99); trainingInfoBean.setCourse_name("c++");
	 * trainingInfoBean.setDuration("5 months");
	 * 
	 * EmployeeOtherInfoBean otherInfoBean=new EmployeeOtherInfoBean();
	 * 
	 * otherInfoBean.setAdhar(24556678); otherInfoBean.setBlood_grp("b+ve");
	 * otherInfoBean.setSpouse_nm("leela");
	 * otherInfoBean.setEmergency_contact_number(567899);
	 * otherInfoBean.setEmergency_contact_person("paul");
	 * otherInfoBean.setFather_nm("divakar"); otherInfoBean.setMother_nm("yogitha");
	 * otherInfoBean.setIschallenged(false); otherInfoBean.setIsmarried(true);
	 * otherInfoBean.setNationality("india"); otherInfoBean.setPan_no("PAN2452542");
	 * otherInfoBean.setPassport("465434"); otherInfoBean.setReligion("hindhu");
	 * 
	 * otherInfoBean.setInfobean(bean);
	 * 
	 * EmployeeAddressPKBean addressPKBean1=new EmployeeAddressPKBean();
	 * addressPKBean1.setAddress_type("present"); addressPKBean1.setInfobean(bean);
	 * 
	 * EmployeeAddressPKBean addressPKBean2=new EmployeeAddressPKBean();
	 * addressPKBean2.setAddress_type("permenent");
	 * addressPKBean2.setInfobean(bean);
	 * 
	 * 
	 * EmployeeAddressInfoBean addressInfoBean1=new EmployeeAddressInfoBean();
	 * addressInfoBean1.setAddressPKBean(addressPKBean1);
	 * addressInfoBean1.setAddress1("neeladri");
	 * addressInfoBean1.setAddress2("kpmtown");
	 * addressInfoBean1.setCity("bangalore"); addressInfoBean1.setCountry("india");
	 * addressInfoBean1.setLandmark("postoffice");
	 * addressInfoBean1.setState("bangalore"); addressInfoBean1.setPincode(2344);
	 * 
	 * 
	 * EmployeeAddressInfoBean addressInfoBean2=new EmployeeAddressInfoBean();
	 * addressInfoBean2.setAddressPKBean(addressPKBean2);
	 * addressInfoBean2.setAddress1("sivapur");
	 * addressInfoBean2.setAddress2("karmalaram");
	 * addressInfoBean2.setCity("bangalore"); addressInfoBean2.setCountry("india");
	 * addressInfoBean2.setLandmark("st.peter church");
	 * addressInfoBean2.setState("bangalore"); addressInfoBean2.setPincode(980);
	 * 
	 * 
	 * EmployeeEducationalPKBean educationalPKBean1= new
	 * EmployeeEducationalPKBean(); educationalPKBean1.setEducation_type("regular");
	 * educationalPKBean1.setInfobean(bean);
	 * 
	 * 
	 * EmployeeEducationalPKBean educationalPKBean2= new
	 * EmployeeEducationalPKBean(); educationalPKBean2.setEducation_type("serial");
	 * educationalPKBean2.setInfobean(bean);
	 * 
	 * EmployeeEducationalInfoBean educationalInfoBean1=new
	 * EmployeeEducationalInfoBean(); educationalInfoBean1.setBranch("it");
	 * educationalInfoBean1.setCollege_name("sri.chaithanya");
	 * educationalInfoBean1.setDegree_type("wrwr");
	 * educationalInfoBean1.setLocation("hibber");
	 * educationalInfoBean1.setPercentage(78.90);
	 * educationalInfoBean1.setUniversity("uks");
	 * educationalInfoBean1.setYop("2018-09-09");
	 * educationalInfoBean1.setEducationalPKBean(educationalPKBean1);
	 * 
	 * EmployeeEducationalInfoBean educationalInfoBean2=new
	 * EmployeeEducationalInfoBean(); educationalInfoBean2.setBranch("cs");
	 * educationalInfoBean2.setCollege_name("sri.ramachandra");
	 * educationalInfoBean2.setDegree_type("hjk");
	 * educationalInfoBean2.setLocation("lokedi");
	 * educationalInfoBean2.setPercentage(56.9);
	 * educationalInfoBean2.setUniversity("opi");
	 * educationalInfoBean2.setYop("2018-03-09");
	 * educationalInfoBean2.setEducationalPKBean(educationalPKBean2);
	 * 
	 * 
	 * 
	 * 
	 * EmployeeExperiencePKBean experiencePKBean1= new EmployeeExperiencePKBean();
	 * experiencePKBean1.setCompany_name("covalense");
	 * experiencePKBean1.setInfobean(bean);
	 * 
	 * EmployeeExperiencePKBean experiencePKBean2=new EmployeeExperiencePKBean();
	 * experiencePKBean2.setCompany_name("Applied Materials");
	 * experiencePKBean2.setInfobean(bean);
	 * 
	 * EmployeeExperienceInfoBean experienceInfoBean1=new
	 * EmployeeExperienceInfoBean(); experienceInfoBean1.setDesignation("manager");
	 * experienceInfoBean1.setExperiencePKBean(experiencePKBean1);
	 * 
	 * EmployeeExperienceInfoBean experienceInfoBean2=new
	 * EmployeeExperienceInfoBean(); experienceInfoBean2.setDesignation("tester");
	 * experienceInfoBean2.setExperiencePKBean(experiencePKBean2);
	 * 
	 * 
	 * HibernateImpl impl= new HibernateImpl(); impl.createEmployee(bean,
	 * otherInfoBean, Arrays.asList(addressInfoBean1,addressInfoBean2),
	 * Arrays.asList(educationalInfoBean1,educationalInfoBean2),
	 * Arrays.asList(experienceInfoBean1,experienceInfoBean2)); }
	 */
	 
	//public static void main(String[] args) {
		/*
		 * EmployeeInfoBean bean2=new EmployeeInfoBean(); bean2.setId(104);
		 * bean2.setName("pooja"); bean2.setAge(50); bean2.setDept_id(1);
		 * bean2.setDesignation("tester");
		 * 
		 * EmployeeInfoBean bean3=new EmployeeInfoBean(); bean3.setId(105);
		 * bean3.setName("lekha"); bean3.setAge(20); bean3.setDept_id(2);
		 * bean3.setDesignation("developer");
		 * 
		 * EmployeeInfoBean bean4=new EmployeeInfoBean(); bean4.setId(106);
		 * bean4.setName("kumar"); bean4.setAge(44); bean4.setDept_id(3);
		 * bean4.setDesignation("co-ordinator");
		 * 
		 * HibernateImpl impl= new HibernateImpl(); impl.createEmployee(bean3);
		 * impl.createEmployee(bean4);
		 */
		/*
		 * TrainingInfoBean trainingInfoBean=new TrainingInfoBean();
		 * trainingInfoBean.setCourse_id(333); trainingInfoBean.setCourse_name("c++");
		 * trainingInfoBean.setDuration("6 months");
		 * 
		 * HibernateImpl impl= new HibernateImpl(); EmployeeInfoBean
		 * infoBean1=impl.getEmployeeInfoBean(1); //EmployeeInfoBean
		 * infoBean2=impl.getEmployeeInfoBean(2);
		 * 
		 * EmployeeInfoBean infoBean2= new EmployeeInfoBean(); infoBean2.setId(107);
		 * infoBean2.setName("yolu");
		 * 
		 * trainingInfoBean.setInfoBeans(Arrays.asList(infoBean1,infoBean2));
		 * 
		 * 
		 * impl.createTraining(trainingInfoBean);
		 */
	//}
	public static void main(String[] args) {
		EmployeeInfoBean bean = new EmployeeInfoBean();
		bean.setId(105);
		bean.setName("malavika");
		bean.setAge(29);
		bean.setDesignation("manager");
		bean.setAccount_number(7899);
		bean.setEmail("malavika@gmail.com");
		bean.setPassword("malavika");
		bean.setSalary(123000);
		bean.setGender("female");
		bean.setPhone(90877);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date date;
		Date dob;
		try {
			date = format.parse("2019-02-01");
			dob = format.parse("1998-08-01");
			bean.setDob(dob);
			bean.setJoining_date(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		EmployeeOtherInfoBean otherInfoBean = new EmployeeOtherInfoBean();
		otherInfoBean.setAdhar(9876);
		otherInfoBean.setBlood_grp("A+ve");
		otherInfoBean.setSpouse_nm("karuna");
		otherInfoBean.setEmergency_contact_number(2345235);
		otherInfoBean.setEmergency_contact_person("jacob");
		otherInfoBean.setFather_nm("dideer");
		otherInfoBean.setMother_nm("changu");
		otherInfoBean.setIschallenged(false);
		otherInfoBean.setIsmarried(false);
		otherInfoBean.setNationality("india");
		otherInfoBean.setPan_no("PAN9800");
		otherInfoBean.setPassport("68568");
		otherInfoBean.setReligion("hindhu");
		otherInfoBean.setInfobean(bean);

		bean.setEmployeeOtherInfoBean(otherInfoBean);
		
		
		 otherInfoBean.setInfobean(bean);
		  
		EmployeeAddressPKBean addressPKBean1 = new EmployeeAddressPKBean();
		addressPKBean1.setAddress_type("present");
		addressPKBean1.setInfobean(bean);

		EmployeeAddressPKBean addressPKBean2 = new EmployeeAddressPKBean();
		addressPKBean2.setAddress_type("permenent");
		addressPKBean2.setInfobean(bean);

		EmployeeAddressInfoBean addressInfoBean1 = new EmployeeAddressInfoBean();
		addressInfoBean1.setAddressPKBean(addressPKBean1);
		addressInfoBean1.setAddress1("shantipura");
		addressInfoBean1.setAddress2("balajinagar");
		addressInfoBean1.setCity("bangalore");
		addressInfoBean1.setCountry("india");
		addressInfoBean1.setLandmark("mvc");
		addressInfoBean1.setState("karnataka");
		addressInfoBean1.setPincode(2344);

		EmployeeAddressInfoBean addressInfoBean2 = new EmployeeAddressInfoBean();
		addressInfoBean2.setAddressPKBean(addressPKBean2);
		addressInfoBean2.setAddress1("kerapuri");
		addressInfoBean2.setAddress2("gottikar");
		addressInfoBean2.setCity("bangalore");
		addressInfoBean2.setCountry("india");
		addressInfoBean2.setLandmark("temple");
		addressInfoBean2.setState("karnataka");
		addressInfoBean2.setPincode(980);
		  
		bean.setAddressInfoBean(Arrays.asList(addressInfoBean1,addressInfoBean2));
		
		//Educational
		EmployeeEducationalPKBean educationalPKBean1 = new EmployeeEducationalPKBean();
		educationalPKBean1.setEducation_type("regular");
		educationalPKBean1.setInfobean(bean);

		EmployeeEducationalPKBean educationalPKBean2 = new EmployeeEducationalPKBean();
		educationalPKBean2.setEducation_type("serial");
		educationalPKBean2.setInfobean(bean);

		EmployeeEducationalInfoBean educationalInfoBean1 = new EmployeeEducationalInfoBean();
		educationalInfoBean1.setBranch("it");
		educationalInfoBean1.setCollege_name("sri.chaithanya");
		educationalInfoBean1.setDegree_type("wrwr");
		educationalInfoBean1.setLocation("hibber");
		educationalInfoBean1.setPercentage(78.90);
		educationalInfoBean1.setUniversity("uks");
		educationalInfoBean1.setYop("2018-09-09");
		educationalInfoBean1.setEducationalPKBean(educationalPKBean1);

		EmployeeEducationalInfoBean educationalInfoBean2 = new EmployeeEducationalInfoBean();
		educationalInfoBean2.setBranch("cs");
		educationalInfoBean2.setCollege_name("sri.ramachandra");
		educationalInfoBean2.setDegree_type("hjk");
		educationalInfoBean2.setLocation("lokedi");
		educationalInfoBean2.setPercentage(56.9);
		educationalInfoBean2.setUniversity("opi");
		educationalInfoBean2.setYop("2018-03-09");
		educationalInfoBean2.setEducationalPKBean(educationalPKBean2);
		
		bean.setEducationalInfoBean(Arrays.asList(educationalInfoBean1,educationalInfoBean2));
		
		//Experience
		EmployeeExperiencePKBean experiencePKBean1 = new EmployeeExperiencePKBean();
		experiencePKBean1.setCompany_name("covalense");
		experiencePKBean1.setInfobean(bean);

		EmployeeExperiencePKBean experiencePKBean2 = new EmployeeExperiencePKBean();
		experiencePKBean2.setCompany_name("Applied Materials");
		experiencePKBean2.setInfobean(bean);

		EmployeeExperienceInfoBean experienceInfoBean1 = new EmployeeExperienceInfoBean();
		experienceInfoBean1.setDesignation("manager");
		experienceInfoBean1.setExperiencePKBean(experiencePKBean1);

		EmployeeExperienceInfoBean experienceInfoBean2 = new EmployeeExperienceInfoBean();
		experienceInfoBean2.setDesignation("tester");
		experienceInfoBean2.setExperiencePKBean(experiencePKBean2);
		  
		bean.setExperienceInfoBean(Arrays.asList(experienceInfoBean1,experienceInfoBean2));
		
		
		HibernateImpl impl = new HibernateImpl();
		impl.createEmployee(bean);
	}
}
