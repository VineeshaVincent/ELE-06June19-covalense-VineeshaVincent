package com.covalense.javaapp.fileobject;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;


public class FilehandlingExample {

	
	public static void main(String[] args) {
		
		FileUtil.writeStringToFile(
				new File("Mytest2.txt"),
				" it is my file",
				Charset.defaultCharset());
		System.out.println("done with this");
	}
}
