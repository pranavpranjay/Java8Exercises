package com.pranjay.java8.training.Java8Exercises.staticAndDefault;

public interface FunctionalInterface {

	void add();
	default void show(){
		System.out.println("Show method of Functional Interface");
	}
	
	default void show1(){
		System.out.println("Show 1 method of Functional Interface");
	}
	
	static void show2(){
		System.out.println("Show 2 method of Functional Interface");
	}
}
