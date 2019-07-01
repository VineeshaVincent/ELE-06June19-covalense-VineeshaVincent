package com.covalense.javaapp.assignmentseven;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.covalense.javaapp.arraylist.Product;

import lombok.extern.java.Log;
@Log
public class ProductTest {

	public static void main(String[] args) {
	ArrayList<Product1>arrlist=new ArrayList<Product1>();
	Product1 pro1=new Product1();
	pro1.setName("pen");
	pro1.setCost(5);
	pro1.setRating(7.6);
	
	Product1 pro2=new Product1();
	pro2.setName("pencil");
	pro2.setCost(3);
	pro2.setRating(8.9);

	Product1 pro3=new Product1();
	pro3.setName("book");
	pro3.setCost(35);
	pro3.setRating(9.1);
	
	Product1 pro4=new Product1();
	pro4.setName("marker");
	pro4.setCost(10);
	pro4.setRating(7.3);
		
	
	arrlist.add(pro1);
	arrlist.add(pro2);
	arrlist.add(pro3);
	arrlist.add(pro4);
	
	Comparator<Product1> c=(i,j)->{
		if(i.getCost()>j.getCost()) {
			return 1;
		}else if(i.getCost()<j.getCost()) {
			return -1;
		}else {
			return 0;
		}
		
	};
	List<Product1> li= arrlist.stream().sorted(c).collect(Collectors.toList());
	for (Product1 product : li) {
		log.info("details are:"+product);
	}
	}
}
