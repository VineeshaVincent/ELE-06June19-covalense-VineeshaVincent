package com.covalense.javaapp.assignment1;

public class pattern4 {
	public static void main(String[] args) {

		int i, j, k = 8;
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				System.out.print("");
			}
			k = k - 4;
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}
}
