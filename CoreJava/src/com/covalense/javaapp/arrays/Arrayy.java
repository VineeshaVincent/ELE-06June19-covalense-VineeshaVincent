package com.covalense.javaapp.arrays;

public class Arrayy {
	
	public static void main(String[] args) {
		
		int[]a= {5,6,2,1,4};
		int[]b= {30,40,50,60,70,80};
		int dest=2;
		int source=2;
		int num=3;
		int counter=1;
		
		for(int j=dest;j<b.length;j++) {
			b[j]=a[source++];
			if(counter==num) {
				break;
			}counter++;
	
		}for(int t:b) {
			System.out.println(t);
		}
}
}

