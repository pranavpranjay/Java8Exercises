package com.pranjay.java8.training.Java8Exercises.functionalInterface;

public class Test1 extends Class3 implements FunctionalInterface/*, FunctionalInterface2*/{

	public static void main(String[] args) {
		FunctionalInterface interface1 = new Test1();
		interface1.show();
		interface1.show1();
		FunctionalInterface.show2();
		
	}

	@Override
	public void add() {
		System.out.println("add method of Functional Interface");
		
	}
	
	/*public void show(){
		System.out.println("Show method of Test1");
	}*/

}
