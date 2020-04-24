package com.pranjay.java8.training.Java8Exercises.staticAndDefault;

public interface FunctionalInterface2 {

	void add();
	default void show(){
		System.out.println("Show method of Functional Interface2");
	}
}
