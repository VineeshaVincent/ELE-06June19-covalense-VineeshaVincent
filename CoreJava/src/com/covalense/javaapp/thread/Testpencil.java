package com.covalense.javaapp.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import lombok.extern.java.Log;

@Log
public class Testpencil {

	public static void main(String[] args) {

		Pencil p1 = new Pencil();
		FutureTask<Integer> ft = new FutureTask<Integer>(p1);
		Thread t1 = new Thread(ft);
		t1.start();

		int i = 0;
		try {
			i = ft.get();
		} catch (InterruptedException | ExecutionException e) {

			e.printStackTrace();
		}

		log.info("value is" + i);

	}
}
