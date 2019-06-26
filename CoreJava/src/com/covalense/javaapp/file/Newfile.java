package com.covalense.javaapp.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Newfile {
	
	public static void main(String[] args) {
		
		String msg="hai.............";
		byte[]by=msg.getBytes();
	try(FileOutputStream fout=new FileOutputStream("vini.txt")) {
				fout.write(by);
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
	}

}
