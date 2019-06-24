package com.covalense.javaapp.beanclass;

public class TestDB {
	public static void main(String[] args) {
		
	
	
	person p=new person();
	DB1 d=new DB1();
	DB2 d2=new DB2();
	
	p.setAge(20);
	p.setName("vini");
	
	d.receive(p);
	d2.receive(p);
	
	}	

}
