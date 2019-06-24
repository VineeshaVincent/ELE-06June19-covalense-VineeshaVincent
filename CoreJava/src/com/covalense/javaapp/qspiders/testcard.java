package com.covalense.javaapp.qspiders;

public class testcard {
	public static void main(String[] args) {
		card j=new card();
		card a=new card();
		
		j.swipe();
		a.swipe();
		
		System.out.println("java count is"+j.count);
		System.out.println("angular count is"+a.count);
		
		System.out.println("organization count is"+card.orgcount);
	}

}
