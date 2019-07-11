package com.covalense.assessment.listofproduct;

import java.util.ArrayList;

import lombok.extern.java.Log;
@Log
public class ProductlistTest {
	public static void main(String[] args) {
		ArrayList<Product> al = new ArrayList<Product>();

		al.add(new Product("computer", 290000.00, "lenovo", "Accesories"));
		al.add(new Product("Mobile", 8000.00, "Mi", "Accesories"));
		al.add(new Product("Laptop", 149000.00, "Apple", "Accesories"));
		al.add(new Product("top", 800, "abc", "cloth"));
		al.add(new Product("fridge", 3400000, "samsung", "Accesories"));
		
		int choice = 2;
		switch (choice) {
		case 1:
			log.info("Fetching product details by Type");
			al.stream().filter(i -> i.getType() == "Accesories").forEach(i -> log.info("" + i));
			break;
		case 2:
			log.info("Fetching product details by range (whose cost is greater than 25000 and lessthan500000");
			al.stream().filter(i -> (i.getCost() > 25000 && i.getCost() < 500000)).forEach(i -> log.info("" + i));
			break;
		default:
			log.info("Enter valid option");

		}
}
}
