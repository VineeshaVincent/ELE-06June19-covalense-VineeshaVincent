package com.covalense.javaapp.stream;

import java.util.ArrayList;
public class TestforeEach {

	
	public static void main(String[] args) {
		
		
		ArrayList<Integer>al=new ArrayList<Integer>();
			
			al.add(15);
			al.add(6);
			al.add(37);
			al.add(18);
			al.add(9);
			al.stream().forEach(i ->System.out.println(i));
		
		}
		}


