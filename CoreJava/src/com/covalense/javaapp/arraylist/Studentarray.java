package com.covalense.javaapp.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Studentarray {

	public static void main(String[] args) {
		
		ArrayList<Arraystudent>al=new ArrayList<Arraystudent>();
		
		
		Arraystudent s1=new Arraystudent();
		s1.name="sayu";
		s1.id=1;
		s1.percentage=67.9;
		
		Arraystudent s2=new Arraystudent();
		s2.name="vini";
		s2.id=11;
		s2.percentage=97.9;
		
		Arraystudent s3=new Arraystudent();
		s3.name="vipin";
		s3.id=13;
		s3.percentage=89.9;
		

		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		
		
		
		for(int i=0;i<al.size();i++)
		{
			Arraystudent s=al.get(i);
			System.out.println("name is"+s.name);
			System.out.println("id is"+s.id);
			System.out.println("percentage is"+s.percentage);
			System.out.println("*************************************************");
		}
		
	}
}
