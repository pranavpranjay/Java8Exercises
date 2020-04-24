package com.pranjay.java8.training.Java8Exercises.functionalInterface;

@FunctionalInterface
interface TestInterface2{
	
	public abstract void sayHi(String name);
}

public class LembdaExpInCustomFunctionalInterface2 {

	public static void main(String[] args) {
		
		TestInterface2 interface1 = new TestInterface2() {
			
			@Override
			public void sayHi(String name) {
				System.out.println("Hello "+name+"   Without lembda");
				
			}
		};
		interface1.sayHi("Java");
		
		TestInterface2 interface2 = (name) ->
			System.out.println("Hello "+name+"     With lembda");
				
		//OR
		/*TestInterface2 interface3 = (String name) ->
			System.out.println("Hello "+name+"     With lembda");*/
		
		
		interface2.sayHi("Java8");

	}

}
