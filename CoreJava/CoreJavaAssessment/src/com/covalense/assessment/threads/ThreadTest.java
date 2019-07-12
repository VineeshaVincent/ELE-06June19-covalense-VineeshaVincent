package com.covalense.assessment.threads;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest {
	public static void main(String[] args) {

		ThreadNumber m1 = new ThreadNumber("MyFirst");
		ThreadNumber m2 = new ThreadNumber("MySecond");
		ThreadNumber m3 = new ThreadNumber("MyThird");
		ThreadNumber m4 = new ThreadNumber("MyFourth");
		ThreadNumber m5 = new ThreadNumber("MyFifth");

		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(m1);
		service.execute(m2);
		service.execute(m3);
		service.execute(m4);
		service.execute(m5);

		service.shutdown();

	}
}
