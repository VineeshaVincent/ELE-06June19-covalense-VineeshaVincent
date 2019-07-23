package com.covalense.warehouse.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Items")
public class ItemBean implements Serializable {

	@Id
	@Column(name="Item_id")
	private int ItemId;
	
	@Column(name="Item_name")
	private String name;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="description")
	private String description;
	
	@Column(name="cost")
	private float cost;
}
