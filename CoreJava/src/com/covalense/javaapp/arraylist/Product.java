package com.covalense.javaapp.arraylist;

public class Product implements Comparable<Product>{

		private String name;
		int cost;
		Double rating;

		@Override
		public int compareTo(Product o) {
			if(this.rating<o.rating) {
				return -1;
			}else if(this.rating>o.rating) {
				return 1;
			}else {

				return 0;
			}
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}


	}
