package com.pranjay.java8.training.Java8Exercises.lembdaException;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class HandleUncheckedExceptionWithLembda {

	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(9,0,4,8);
		//Consumer<Integer> consumer = (i) -> System.out.println(50/i);
		
		//This below code will throw AE exception
		
		//numList.forEach(i -> System.out.println(50/i));
		
		//Need to put into a try-catch block
		numList.forEach(i -> {
			try {
				System.out.println(50/i);
			} catch (Exception e) {
				System.out.println(e.getClass()+" occured, caused: "+e.getMessage());
			}
		});
		
		/*
		 * the above code we can make as a wrapper
		 * by creating a new static wrapper method
		 */
		numList.forEach(lembdaWrapper(i -> System.out.println(50/i)));
		
		/*
		 * lembdaWrapper is not a generic, so we can make it generic
		 * and re-use for every lembda expression where it required. 
		 */
		numList.forEach(consumerWrapper(i -> System.out.println(50/i)/*, RuntimeException.class*/));
		
		
	}
	
	private static Consumer<Integer> lembdaWrapper(Consumer<Integer> consumer){
		return i ->{
			try {
				consumer.accept(i);
			} catch (Exception e) {
				System.out.println(e.getClass()+" occured, caused: "+e.getMessage());
			}
		}; 
	}
	
	private static <T> Consumer<T> consumerWrapper(Consumer<T> consumer){
		return i ->{
			try {
				consumer.accept(i);
			} catch (Exception e) {
				System.out.println(e.getClass()+" occured, caused: "+e.getMessage());
			}
		}; 
	}
}
