package com.covalense.javaapp.assignmentfour;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class File3 {
	

	public static void main(String[] args) {
		
		try {
			FileUtils.writeStringToFile(new File("file3.txt"),"im the third file");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
