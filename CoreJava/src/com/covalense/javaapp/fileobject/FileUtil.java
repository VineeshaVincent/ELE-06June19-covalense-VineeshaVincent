package com.covalense.javaapp.fileobject;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class FileUtil {

	public static void main(String[] args) {
		try {
		
		System.out.println("reading the file...................");
		String fileData=FileUtil.readFileToString(new File("Mytest2.txt"));
		System.out.println("file data===>"+fileData);
	}catch(IOException e) {
	e.printStackTrace();
	}
}

	}

