package com.covalense.javaapp.fileobject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {
	
	public static void main(String[] args) {
		
		
		person p=new person();
		p.setName("vipin");
		p.setId(23);
		try {
			FileOutputStream fout=new FileOutputStream ("vini.txt");
			ObjectOutputStream object=new ObjectOutputStream (fout);
			object.writeObject(p);
			
			object.close();
			System.out.println("done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
