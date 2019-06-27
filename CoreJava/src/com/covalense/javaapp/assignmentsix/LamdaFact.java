package com.covalense.javaapp.assignmentsix;

import java.util.logging.Logger;

interface Fact{
	int fact(int a);
}
public class LamdaFact {
	public static void main(String[] args) {
		final Logger loger= Logger.getLogger(" LamdaFact");
		Fact f=a->{
			int k=1;
			for(int i=1;i<=a;i++) {
				k=k*i;
			}
			return k;
		};
		int res=f.fact(6);
		loger.info("Factorial is   "+res);
	}

}
