package com.covalense.javaapp.arrays;

public class EQUAL {

	public static boolean isEqual(int[] first, int[] second) {
		if (first == second)
			return true;

		if (first == null || second == null)
			return false;

		if (first.length != second.length)
			return false;

		for (int i = 0; i < first.length; i++) {
			if (first[i] != second[i])
				return false;
		}

		return true;
	}

	public static void main(String[] args)
	{
		int[] first = { 1, 2, 3 };
		int[] second = { 1, 2, 3 };

		boolean result = isEqual(first, second);
		if (result)
			System.out.println("Given arrays are equal");
		else
			System.out.println("Given arrays are not equal");
	}
}
