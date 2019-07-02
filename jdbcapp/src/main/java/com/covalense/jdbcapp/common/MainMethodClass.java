package com.covalense.jdbcapp.common;

public class MainMethodClass {

	
	public static void main(String[] args) {
		
		
		//ClassA ref=new ClassA();
		//ref.printMessage();
		
		
		/*String str="one";
		Myinterface ref=MyClass.getInstance(str);
		ref.printMessage();*/
		
		//String str="two";
		Connection ref=DriverManager.getInstance(args[0]);
		ref.printMessage();
		
		
	}//End of main
}//End of class
