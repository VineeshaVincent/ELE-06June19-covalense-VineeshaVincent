package com.covalense.javaapp.lamda;

import java.util.logging.Logger;

interface Fact{
	int fact(int a);
}
public class Testfact {
public static void main(String[] args) {
	
	final Logger loger= Logger.getLogger("AddLamda");
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
