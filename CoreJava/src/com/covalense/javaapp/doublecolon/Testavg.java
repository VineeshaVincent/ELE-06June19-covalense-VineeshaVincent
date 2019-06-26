package com.covalense.javaapp.doublecolon;

public class Testavg {
public static void main(String[] args) {
	
	Mystudent my=new Mystudent();
	
	Average a=my:: calavg;
	a.avg(11, 20, 15);
}
}
