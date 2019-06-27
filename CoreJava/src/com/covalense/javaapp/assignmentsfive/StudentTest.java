package com.covalense.javaapp.assignmentsfive;

import java.util.ArrayList;
import java.util.Collections;

import com.covalense.javaapp.arraylist.Arraystudent;

public class StudentTest {


		public static void main(String[] args) {
			
			ArrayList<StudentBean> al=new ArrayList<StudentBean>();
			
			
			StudentBean s1=new StudentBean ();
			s1.setName("liju");
			s1.setId(16);
			s1.setPercentage(67.9);
			
			StudentBean s2=new StudentBean();
			s2.setName("mini");
			s2.setId(17);
			s2.setPercentage(76.79);
			
			StudentBean s3=new StudentBean();
			s3.setName("letha");
			s3.setId(18);
			s3.setPercentage(93.8);
			
			StudentBean s4=new StudentBean();
			s4.setName("ramya");
			s4.setId(19);
			s4.setPercentage(67.0);
			

			StudentBean s5=new StudentBean();
			s5.setName("pappu");
			s5.setId(6);
			s5.setPercentage(33.5);
			
			al.add(s1);
			al.add(s2);
			al.add(s3);
			al.add(s4);
			
			
			
			for(int i=0;i<al.size();i++)
			{
				StudentBean s=al.get(i);
				System.out.println("name is"+s.getName());
				System.out.println("id is"+s.getId());
				System.out.println("percentage is"+s.getPercentage());
				System.out.println("*************************************************");
			}
			
		}
	}


