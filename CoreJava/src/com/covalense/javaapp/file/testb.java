package com.covalense.javaapp.file;

import java.io.FileOutputStream;

public class testb {

	
	public static void main(String[] args) {
		
		
		String msg="twingle twingle little stars";
		
		byte b[]=msg.getBytes();
		
		
		try {
			FileOutputStream fout=new FileOutputStream("myfile.txt");
			
			fout.write(b);
			
			fout.close();
			System.out.println("data written into file");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
				}
}
