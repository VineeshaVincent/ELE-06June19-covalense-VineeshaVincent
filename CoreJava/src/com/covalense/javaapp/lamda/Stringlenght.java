package com.covalense.javaapp.lamda;

interface Lenght{
	int String(String str);
	
}
public class Stringlenght {

	
	public static void main(String[] args) {
		
	Lenght k = (str1)->{
			return str1.length();
		};
		String str = "vineesha";
		int s=k.String(str);
		System.out.println(s);
	}
}
