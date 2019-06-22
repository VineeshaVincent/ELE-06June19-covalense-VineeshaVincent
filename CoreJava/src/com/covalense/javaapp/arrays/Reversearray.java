package com.covalense.javaapp.arrays;
import java.util.Arrays;
import java.util.Collections;

public class Reversearray {

		
		public static void main(String[] args) {
			
			String[]s={"vipin","vini","ambili","swetha"};
			
			Arrays.sort(s,Collections.reverseOrder());
			
			for(int i=0;i<s.length;i++) {
				System.out.println(s[i]);
		}
	}
		
	}

