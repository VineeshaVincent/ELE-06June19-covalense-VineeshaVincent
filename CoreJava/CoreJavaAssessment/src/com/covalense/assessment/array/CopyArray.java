package com.covalense.assessment.array;

import lombok.extern.java.Log;

@Log
public class CopyArray {
	public static void main(String[] args) {

		int[] a = { 8, 2, 5, 41 };
		int[] d = new int[a.length];

		for (int i = 0; i <= a.length - 1; i++) {
			d[i] = a[i];
		}
		for (int i = 0; i <= a.length - 1; i++) {
			log.info("element is: " + d[i]);
		}
	}
}
