package com.covalense.javaapp.doublecolon;

public class Mystudent {
	
	void calavg(int a,int b,int c) {
		double r=(a+b+c)/3.0;
		System.out.println("avg is"+r);
	}
	
	int Fact(int n) {
		
		int f=1;
		for(int i=1;i<=n;i++) {
			
			f=f*i;
		}
		return f;
	}

}
