package com.covalense.javaapp.abstraction;

public class GTest {
	
	public static void main (String[] args)
	{
		Browser b=new Browser();
		@SuppressWarnings("unused")
		Gmail m=new Gmail();
		Gdrive d=new Gdrive ();
	
	
	
	b.open(d);
	
	
	}

}
