package com.covalense.javaapp.doublecolon;

public class Testadd {

		
		
		static void sum(int a,int b) {
		int c=a+b;
		System.out.println("sum is"+c);
	}
public static void main(String[] args) {
	
	mymath m=Testadd :: sum;
	int i=m.add(6, 4);

}
}
