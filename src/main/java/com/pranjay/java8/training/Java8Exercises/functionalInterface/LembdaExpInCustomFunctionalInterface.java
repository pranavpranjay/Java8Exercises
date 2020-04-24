package com.pranjay.java8.training.Java8Exercises.functionalInterface;

@FunctionalInterface
interface TestInterface{
	
	public abstract void show();
}

public class LembdaExpInCustomFunctionalInterface {

	public static void main(String[] args) {
		
		TestInterface interface1 = new TestInterface() {
			
			@Override
			public void show() {
				System.out.println("Displaing show method without lembda...");
				
			}
		};
		interface1.show();
		
		TestInterface interface2 = () ->
				System.out.println("Displaing show method with lembda...");
		
		interface2.show();

	}

}
