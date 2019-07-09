package com.covalense.assessment.array;

import java.util.Arrays;

import lombok.extern.java.Log;
@Log
public class ArraySort {
	public static void main(String[] args) {

		double[] a = { 6.7, 3.7, 1.5, 6.2, 9.7 };

		Arrays.sort(a);

		for (int i = 0; i <= a.length - 1; i++) {
			log.info(a[i] + " ");
		}
	}

}
