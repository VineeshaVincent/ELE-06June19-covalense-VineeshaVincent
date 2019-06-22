package com.covalense.javaapp.assignment1;


public class pattern6 {
	
	public static void main(String[] args) {	
		int r=4;
		for(int i=1;i<=r;i++) {
			
			
			
			for(int j=0;j<r-i;j++) {
				
				System.out.print("");
			}
		for(int j=0;j<(i*2)-1;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}
}


