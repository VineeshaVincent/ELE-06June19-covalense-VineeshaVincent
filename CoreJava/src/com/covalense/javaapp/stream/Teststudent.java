package com.covalense.javaapp.stream;

import java.util.ArrayList;
import java.util.Comparator;

public class Teststudent {
	
	static Comparator<StudentHigh> c=(a,b)->{
		
		if(a.getPercentage()>b.getPercentage()) {
			return 1;
		}else if(a.getPercentage()<b.getPercentage()) {
			return -1;
		}else {
			return 0;
		}
	};
	
	static StudentHigh getTopper(ArrayList<StudentHigh>al) {		
return al.stream().max(c).get();
	}
	static StudentHigh getLow (ArrayList<StudentHigh>al) {
		return al.stream().min(c).get();
	}
	public static void main(String[] args) {
		
		StudentHigh s1=new StudentHigh(1,"lena",59.0);
		StudentHigh s2=new StudentHigh(2,"sudha",78.9);
		StudentHigh s3=new StudentHigh(3,"riya",67.9);
		StudentHigh s4=new StudentHigh(4,"goku",30.7);
		StudentHigh s5=new StudentHigh(5,"rithu",70.8);
		
		
		ArrayList<StudentHigh>al=new ArrayList<StudentHigh>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		
		StudentHigh s=getTopper(al);
		System.out.println("topper is   "+s.getName()+" with percentage  "+s.getPercentage());
		
		StudentHigh s11=getLow(al);
		System.out.println("lowest is   "+s11.getName()+" with percentage  "+s11.getPercentage());
		
		
	}

}
