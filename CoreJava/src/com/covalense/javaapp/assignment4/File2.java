package com.covalense.javaapp.assignment4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import lombok.extern.java.Log;

@Log
public class File2 {
public static void main(String[] args) {
		
		try {
			FileUtils.writeStringToFile(new File("file2.txt"),"im the second file");
			log.info("data from first file written into second");

}
		catch(IOException e) {
			e.printStackTrace();
		}
}
}
