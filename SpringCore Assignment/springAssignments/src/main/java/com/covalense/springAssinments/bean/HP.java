package com.covalense.springAssinments.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.covalense.springAssinments.interfaces.Laptop;
import com.covalense.springAssinments.interfaces.StorageDevice;

import lombok.extern.java.Log;

@Log
public class HP  implements Laptop {
	private String brand;
	private String color;
	private double cost;
	private double weight;
	private double ram;
	private String os;
	
	@Autowired
	@Qualifier("pendrive")
	private StorageDevice storageDevice;

	public void display() {
		log.info("HP display() method ");

	}// End of display()

	public void process() {
		log.info("HP process() method ");

	}// End of process()

	public void showSpecification() {
		log.info("Brand is :" + brand);
		log.info("Color is :" + color);
		log.info("Cost is :" + cost);
		log.info("Weight is :" + weight);
		log.info("RAM is :" + ram);
		log.info("OS is :" + os);
		
		
		
	}// End of showSpecification()

	public void getStorage() {

		storageDevice.write();
		storageDevice.read();
		storageDevice.format();

	}// End of getStorage()

	
}
