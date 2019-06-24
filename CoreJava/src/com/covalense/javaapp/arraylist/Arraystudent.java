package com.covalense.javaapp.arraylist;

public class Arraystudent implements Comparable<Arraystudent>{

	String name;
	int id;
	Double percentage;
	/*logic to sort student with respect to id*/
	/*
	 * @Override public int compareTo(Arraystudent o) {
	 * 
	 * if(this.id<o.id) { return -1; } else if(this.id>o.id) { return 1; } else {
	 * return 0; } }
	 */
	/*Logic to sort student with respect to  percentage*/
	/*public int compareTo(Arraystudent s) {
		
		if(this.percentage<s.percentage) {
			return -1;
		}
		else if(this.percentage>s.percentage) {
			return 1;
		}
		else {
		return 0;
	}
	
	
	
	}*/
	@Override
	public int compareTo(Arraystudent str) {
		
		String a=this.name;
		String b=str.name;
		
		int k=a.compareTo(b);
		return k;
	}

}
