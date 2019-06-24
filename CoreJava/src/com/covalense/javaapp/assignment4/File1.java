package com.covalense.javaapp.assignment4;
	import java.io.File;

public class File1 {
		
		public static void main(String[] args) {
			
			
			File f=new File("testout.txt");
			try {
				boolean res=f.createNewFile();
				System.out.println("welcome");
			System.out.println("result is"+res);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}

	}



