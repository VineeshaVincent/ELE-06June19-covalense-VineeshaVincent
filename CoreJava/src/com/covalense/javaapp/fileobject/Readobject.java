package com.covalense.javaapp.fileobject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Readobject {
	
	public static void main(String[] args) {
		
		FileInputStream fin=null;
		ObjectInputStream oin=null;
		
		
		try {
			 fin=new FileInputStream ("vini.txt");
			 oin=new ObjectInputStream (fin);
			person p=(person)oin.readObject();
			System.out.println("name ="+p.getName());
			System.out.println("id ="+p.getId());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(oin!=null) {
				try {
					oin.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
				}
			}
	}

}
