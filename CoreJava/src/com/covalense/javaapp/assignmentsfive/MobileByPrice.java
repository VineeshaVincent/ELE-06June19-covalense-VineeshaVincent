package com.covalense.javaapp.assignmentsfive;

import java.util.Comparator;

public class MobileByPrice implements Comparator<Mobile>{

	@Override
	public int compare(Mobile o1, Mobile o2) {
		return o1.price.compareTo(o2.price);
	}

	}
