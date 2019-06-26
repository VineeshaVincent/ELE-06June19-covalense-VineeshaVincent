package com.covalense.javaapp.assignment4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import lombok.extern.java.Log;
@Log
public class CsvRead {
	public static final String delimiter=".";

	public static void main(String[] args) {
		//file to read
		
		try {
			
			File File=new File("firstfile.csv");
			FileReader fr=new FileReader(File);
			BufferedReader br=new BufferedReader(fr);
			
			String line="";
			br.readLine();
			
			
			String[]tempArr;
			while((line=br.readLine())!=null) {
				
				tempArr=line.split(delimiter);
				for(String tempStr:tempArr) {
					log.info(tempStr+"");
				
				}
				log.info("");
			}
			br.close();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
