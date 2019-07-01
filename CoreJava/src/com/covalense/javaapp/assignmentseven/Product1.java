package com.covalense.javaapp.assignmentseven;

public class Product1 {

	String name;
	int cost;
	Double rating;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Product1 [name=" + name + ", cost=" + cost + ", rating=" + rating + "]";
	}
	
	
	
	
}
