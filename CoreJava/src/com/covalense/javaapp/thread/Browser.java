package com.covalense.javaapp.thread;

public class Browser extends Thread{
	Pvr ref;
	public Browser(Pvr ref) {
		this.ref=ref;
		
}
	public void run() {
		ref.book();
	}

}
