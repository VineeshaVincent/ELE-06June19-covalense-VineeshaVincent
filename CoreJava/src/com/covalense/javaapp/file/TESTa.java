package com.covalense.javaapp.file;

import java.io.File;
public class TESTa {
	public static void main(String[] args) {
		
		File f=new File("movies/kannada/new");
		boolean res=f.mkdirs();
		System.out.println("result is"+res);
	}

}
