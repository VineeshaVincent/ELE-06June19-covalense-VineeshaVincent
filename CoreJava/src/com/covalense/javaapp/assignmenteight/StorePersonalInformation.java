package com.covalense.javaapp.assignmenteight;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;
@Log
public class StorePersonalInformation {

	
	public static void main(String[] args) {
		
		try {
			FileOutputStream fout= new FileOutputStream("demo properties");
			Properties p=new Properties();
			
			p.setProperty("name", "mithra");
			p.setProperty("address", "koramangala");
			p.setProperty("company name", "covalense");
			p.setProperty("phone no", "90612973454");
			
			p.store(fout, "personal details are:");
			log.info("file created");
			
		
		}catch(FileNotFoundException e) {
			e.printStackTrace(); 
		}catch(IOException e) {
			
			e.printStackTrace();
		}
	}
}
