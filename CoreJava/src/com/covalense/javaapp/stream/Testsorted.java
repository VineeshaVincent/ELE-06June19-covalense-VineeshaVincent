package com.covalense.javaapp.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
public class Testsorted {

	public static void main(String[] args) {
		
	
	ArrayList<Integer>al=new ArrayList<Integer>();
	
	al.add(15);
	al.add(6);
	al.add(37);
	al.add(18);
	al.add(9);
	
/*al.stream().sorted();
log.info(""+al);*/

List<Integer>s=al.stream().sorted().collect(Collectors.toList());

log.info(""+s);
}
}
