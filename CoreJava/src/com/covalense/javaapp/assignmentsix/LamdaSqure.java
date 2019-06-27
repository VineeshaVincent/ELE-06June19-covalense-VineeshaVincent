package com.covalense.javaapp.assignmentsix;

import java.util.logging.Logger;
	
interface Squre{
	int squre(int a);
}
public class LamdaSqure {
	public static void main(String[] args) {
		final Logger loger= Logger.getLogger(" LamdaSqure");
		
		Squre s=a->{
			int sq;
			sq =  a*a;
			return sq;
	
		};
	
	double res =s.squre(6);
	loger.info("Squre is  "+res);
	}
}



