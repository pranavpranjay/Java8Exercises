package com.pranjay.java8.training.Java8Exercises;

abstract class  test1 implements inter{
	//abstract void m1();
	int i = 10;
	int j = 20;
}

interface inter {
	void m2();
	void m3();
	int i = 19;
	int k = 29;
}


public class TestApp extends test1{
	
	int j = 30;
	int k = 39;
	
	@Override
	public void m2() {
		System.out.println("m2");
		
	}

	@Override
	public void m3() {
		System.out.println("m3");
		
	}
	
	public static void main(String[] args) {
		
		TestApp app = new TestApp();
		app.m2();
		
		inter app1 = new TestApp();
		app1.m2();
		System.out.println(app1.i);
		//System.out.println(app1.j);
		
		test1 app2 = new TestApp();
		app2.m2();
		System.out.println(app2.i);
		System.out.println(app2.j);
		System.out.println(app2.k);
	}
	
	

}
