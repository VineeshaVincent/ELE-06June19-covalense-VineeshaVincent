package com.covalense.javaapp.assignmentfour;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;



public class ApeendFile1File2 {

	
	public static void main(String[] args) {
		
		try {
			
			String data1=FileUtils.readFileToString(new File("file1.txt"));
			FileUtils.writeStringToFile(new File("file2.txt"),data1,true);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
