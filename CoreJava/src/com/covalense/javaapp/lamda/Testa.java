package com.covalense.javaapp.lamda;
 
	interface sum{
		int add(int a,int b);
	}
public class Testa{
	
	public static void main(String[] args) {
		
		sum s=(a,b)->a+b;
		
		int i=s.add(5, 7);
		
		System.out.println("result is"+i);
	}
}
	
	

