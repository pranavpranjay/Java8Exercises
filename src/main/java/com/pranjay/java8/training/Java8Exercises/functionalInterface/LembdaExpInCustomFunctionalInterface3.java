package com.pranjay.java8.training.Java8Exercises.functionalInterface;

@FunctionalInterface
interface TestInterface3{
	
	public abstract int calculateSum(int num1, int num2);
}

public class LembdaExpInCustomFunctionalInterface3 {

	public static void main(String[] args) {
		
		TestInterface3 interface1 = new TestInterface3() {
			
			@Override
			public int calculateSum(int num1, int num2) {
				return num1+num2;
				
			}
		};
		System.out.println("Without Lembda	Sum: "+interface1.calculateSum(5,8));
		
		
		TestInterface3 interface2 = (num1, num2)->num1+num2;
		System.out.println("With Lembda	Sum: "+interface2.calculateSum(5,8));

	}

}
