package com.covalense.javaapp.file;
import java.io.File;
public class TestFile {
	
	public static void main(String[] args) {
		
		
		File f=new File("vini.txt");
		
		try {
			boolean res=f.createNewFile();
		System.out.println("result is"+res);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
