package com.pranjay.java8.training.Java8Exercises.methodReference;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MethodReferenceWithStaticMethod2 {
	
	public static void myrun(){
		System.out.println("Using method reference:		My Service is running...");
	}
	public static void main(String[] args) {
		ExecutorService service = Executors.newSingleThreadExecutor();
		Runnable command = () -> System.out.println("Using lembda	My Service is running....");
		
		service.execute(command);
		
		/*
		 * Now if we want use same code as a method reference
		 * then we need to create a static method and use method reference
		 * method  reference is used for a static method
		 */
		
		Runnable command1 = MethodReferenceWithStaticMethod2::myrun;
		
		service.execute(command1);
	}
	

}
