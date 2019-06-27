package com.covalense.javaapp.assignmentfour;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class File1 {

	
	public static void main(String[] args) {
		
		try {
			FileUtils.writeStringToFile(new File("file1.txt"),"im the first file");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
