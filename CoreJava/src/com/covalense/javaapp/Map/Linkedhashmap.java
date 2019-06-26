package com.covalense.javaapp.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Linkedhashmap {
	
	public static void main(String[] args) {
		
		LinkedHashMap<Character,Double>lm=new LinkedHashMap<Character,Double>();
		
		TreeMap<String, Integer>tm=new TreeMap<String,Integer>();
			
			HashMap<String, Integer>hm=new HashMap<String, Integer>();
		hm.put("one", 1);
		hm.put("two", 2);
		hm.put("three", 3);
		hm.put("four", 4);
		
		for(Map.Entry<String,Integer>e :hm.entrySet()) {
		
		String key=e.getKey();
		Integer val= e.getValue();
		
		
		System.out.println("key is......"+key);
		System.out.println("value is............"+val);
	}

}
}
