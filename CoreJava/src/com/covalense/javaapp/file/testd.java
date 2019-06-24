package com.covalense.javaapp.file;

import java.io.FileWriter;

public class testd {

	public static void main(String[] args) {

		
		String msg="welcome";
		
		char c[]=msg.toCharArray();
		
		try {
			FileWriter fw=new FileWriter("password.txt");
			fw.write(c);
			fw.flush();
			fw.close();
			System.out.println("done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
