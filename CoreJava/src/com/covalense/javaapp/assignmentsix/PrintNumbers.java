package com.covalense.javaapp.assignmentsix;

import java.util.logging.Logger;

interface Range
{
	int range(int a);
}
public class PrintNumbers {

	public static void main(String[] args) {
		final Logger loger= Logger.getLogger("PrintNumbers ");	
	
		Range r =a->{
			loger.info("numbers are:");
			for(int i=0;i<=a;i++) {
				

System.out.println(i);			}
			return a;
			
		};
		int res=r.range(9);
}
}
