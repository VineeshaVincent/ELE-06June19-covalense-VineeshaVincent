package com.covalense.javaapp.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Hashforeach {
	public static void main(String[] args) {
		
	
	
	LinkedHashMap<Character,Double>lm=new LinkedHashMap<Character,Double>();
	
	TreeMap<String, Integer>tm=new TreeMap<String,Integer>();
		
		HashMap<String, Integer>hm=new HashMap<String, Integer>();
	hm.put("one", 1);
	hm.put("two", 2);
	hm.put("three", 3);
	hm.put("four", 4);
	
	
	System.out.println("**************only keys************");
	Set<String>ts=hm.keySet();
	for(String s:ts) {
		System.out.println(s);
}
	
	System.out.println("**********only values*****************");
	Collection<Integer>ci=hm.values();
	Iterator<Integer>it=ci.iterator();
	while(it.hasNext()) {
		Integer r=it.next();
		System.out.println(r);
	}

}
}
