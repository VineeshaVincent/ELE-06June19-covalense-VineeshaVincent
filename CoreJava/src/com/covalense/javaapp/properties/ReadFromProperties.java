package com.covalense.javaapp.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ReadFromProperties {
	public static void main(String[] args) {
		
		try {
			FileInputStream fin= new FileInputStream("demo properties");
			Properties p=new Properties();
			
			p.load(fin);
			String phone=p.getProperty("phn no");
			String name=p.getProperty("company");
			
			System.out.println("phno is"+phone);
			System.out.println("name is "+name);
		} catch (IOException e) {
			e.printStackTrace();
		}
}
		

	}

