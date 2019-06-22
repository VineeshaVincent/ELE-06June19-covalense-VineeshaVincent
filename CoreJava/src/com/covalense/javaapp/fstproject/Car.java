package com.covalense.javaapp.fstproject;

public class Car {
public static void main(String[] args) {
	int Exp=650000;
	double rto=(Exp*14.26)/100;
	double insurence=(Exp*9.76)/100;
	double total=Exp+rto+insurence;
	System.out.println("Ex show room price is"+Exp);
	System.out.println("rto charge  is"+rto);
	System.out.println("insurence is"+insurence);
	System.out.println("totalprice is"+total);
}

}
