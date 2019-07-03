package com.covalense.javaapp.assignmenteight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;

@Log
public class PersonalInfoRead {

	public static void main(String[] args) {
		
		try {
			FileInputStream fin= new FileInputStream("demo properties");
			Properties p=new Properties();
			p.load(fin);
			
			
			String name=p.getProperty("name");
			String address=p.getProperty("address");
			String phone=p.getProperty("phn no");
			String email=p.getProperty("email");
			String company=p.getProperty("company");
			
			log.info("name is"+name);
			log.info("address is"+address);
			log.info("phone is"+phone);
			log.info("email is"+email);
			log.info("company is"+company);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
