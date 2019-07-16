package com.covalense.hibernateapp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="product")
public class ProductBean  implements Serializable{
	@Id
	@Column(name="productId")
	int productId;
	@Column(name="productname")
	String productname;
	@Column(name="price")
	double price;
	@Column(name="color")
	String color;
	@Column(name="weight")
	double weight;
}
