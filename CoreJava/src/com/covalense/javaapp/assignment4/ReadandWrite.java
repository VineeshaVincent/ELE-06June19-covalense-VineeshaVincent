package com.covalense.javaapps.assignment4;


	import java.io.FileInputStream;
	import java.io.FileOutputStream;

	public class ReadandWrite {

	   public static void main(String[] args) {

	     try {

	           FileInputStream fin = new FileInputStream("testout.txt");

	           int i = 0;
	           String s = "welcome";

	           while((i=fin.read())!=-1) {

	               s = s + String.valueOf((char)i);

	           }

	           FileOutputStream fout = new FileOutputStream("newtestout1.txt");
	           byte[] b = s.getBytes();

	           fout.write(b);
	           fout.close();

	           System.out.println("Done reading and writing!!");

	      } catch(Exception e){
	         System.out.println(e);
	      }

	    }

	 }


