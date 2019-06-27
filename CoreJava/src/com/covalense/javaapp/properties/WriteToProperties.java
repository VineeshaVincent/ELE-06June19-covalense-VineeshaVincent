package com.covalense.javaapp.properties;



import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;



import lombok.extern.java.Log;
@Log
public class WriteToProperties {
	public static void main(String[] args) {
	
		
		try {
		FileOutputStream fout= new FileOutputStream("demo properties");
		Properties p=new Properties();
		
		
		p.setProperty("company name", "covalense");
		p.setProperty("phone no", "90612973454");
	
			p.store(fout, "company details");
			log.info("file created");
			
		
		} catch (IOException e) {
			e.printStackTrace();
		}
}
}
