package com.pranjay.java8.training.Java8Exercises.functionalInterface;

public class LembdaExpInJdkFunctionalInterface {

	public static void main(String[] args) {
		
		/*
		 * Without Lembda exp
		 */
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Any business logic here...");
				
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		
		/*
		 * Using lembda exp because Runnable is a functional interface
		 * Lembda exp applies only on functional interface
		 */
		
		Runnable runnable1 = () ->
				System.out.println("Any business logic here. Using Lembda..");
		
		Thread thread1 = new Thread(runnable1);
		thread1.start();
		
		//OR
		
		Thread thread2 = new Thread(() ->
		System.out.println("Any business logic here. Using Lembda.."));
		thread2.start();
		
	}

}
