package com.covalense.springAssinments.bean;

import com.covalense.springAssinments.interfaces.StorageDevice;

import lombok.extern.java.Log;

@Log
public class PenDrive implements StorageDevice{

	private int capacity;
	private double writingSpeed;
	private double readingSpeed;

	public void write() {
		log.info("HardDisk write() method "+writingSpeed);
	}//End of write()

	public void read() {
		log.info("HardDisk read() method "+readingSpeed);
	}//End of read()

	public void format() {
		log.info("HardDisk format() method "+capacity);
	}//End of format()
}
