package com.covalense.springAssinments.bean;

import com.covalense.springAssinments.interfaces.StorageDevice;

import lombok.extern.java.Log;

@Log
public class HardDisk  implements StorageDevice{

	private int capacity;
	private double writingSpeed;
	private double readingSpeed;

	public void write() {
		log.info("HardDisk write() method "+writingSpeed);
	}

	public void read() {
		log.info("HardDisk read() method "+readingSpeed);
	}

	public void format() {
		log.info("HardDisk format() method "+capacity);
	}
}
