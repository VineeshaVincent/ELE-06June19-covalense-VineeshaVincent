package com.covalense.javaapp.assignmentfour;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import lombok.extern.java.Log;

@Log
public class Swrite {
	public static void main(String[] args) {

		Student[] s = new Student[4];
		Student s1 = new Student();
		s1.setName("liya");
		s1.setPercentage(56);
		s1.setRollno(1);

		Student s2 = new Student();
		s2.setName("liya");
		s2.setPercentage(56);
		s2.setRollno(1);

		Student s3 = new Student();
		s3.setName("liya");
		s3.setPercentage(56);
		s3.setRollno(1);

		Student s4 = new Student();

		s4.setName("liya");
		s4.setPercentage(56);
		s4.setRollno(1);

		s[0] = s1;
		s[1] = s2;
		s[2] = s3;
		s[4] = s4;

		FileInputStream fin = null;
		ObjectInputStream oin = null;

		try {
			FileOutputStream fout = new FileOutputStream("studentdata.txt");
			ObjectOutputStream object = new ObjectOutputStream(fout);
			object.writeObject(s);

			fin = new FileInputStream("studentdata.txt");
			oin = new ObjectInputStream(fin);

			Student[] st = (Student[]) oin.readObject();
			log.info("students got percentage more than 80%");
			for (int i = 0; i < st.length; i++) {
				if (st[i].getPercentage() > 80) {
					log.info(st[i].getName());
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
