package com.covalense.javaapps.assignment6;

import java.util.logging.Logger;

interface Sum{
		int add(int a,int b);
	}
public class AddLamda{
	
	public static void main(String[] args) {
		final Logger loger= Logger.getLogger("AddLamda");
		
		Sum s=(a,b)->a+b;
		
		int i=s.add(6, 9);
		
		loger.info("result is"+i);
	}
}
	

