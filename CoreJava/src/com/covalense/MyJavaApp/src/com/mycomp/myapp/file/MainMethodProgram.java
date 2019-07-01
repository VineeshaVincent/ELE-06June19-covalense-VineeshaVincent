package com.mycomp.myapp.file;

import com.covalense.filecreationutil.util.CreateFileUtil;

public class MainMethodProgram {

	
	public static void main(String[] args) {
		CreateFileUtil util=new CreateFileUtil();
		util.createFile("MyAnotherFile","sample data");
		
	}
}
