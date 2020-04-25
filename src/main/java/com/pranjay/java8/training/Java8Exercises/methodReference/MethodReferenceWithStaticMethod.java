package com.pranjay.java8.training.Java8Exercises.methodReference;

public class MethodReferenceWithStaticMethod {
	
	public static int count(){
		return 1;
	}
	public static void main(String[] args) {
		int a = MethodReferenceWithStaticMethod.count();
		System.out.println("Count: "+a);

	}

}
