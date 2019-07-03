package com.covalense.jdbc.connectionpool;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Properties;

public class Propertyutil {

	
	private static Propertyutil util=null;
	Properties properties=null;
	public static Propertyutil getPropertyutil()throws Exception{
		if(util==null) {
			util=new Propertyutil();
		}
		return util;
	}//end
	private Propertyutil()throws Exception{
		properties =new Properties();
		properties.load(new FileInputStream("db.properties"));
	
	}//end
	public String getProperty(String key) {
		return properties.getProperty(key);
	}
}//End of class
