package com.pranjay.java8.training.Java8Exercises.iterateMap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class ClientApp {

	public static void main(String[] args) {
		
		Map<Integer, Employee> map = new HashMap<>();
		
		map.put(01, new Employee("AAA", 01, 20, 50000));
		map.put(02, new Employee("ABB", 02, 28, 40000));
		map.put(03, new Employee("BBB", 03, 30, 60000));
		map.put(04, new Employee("ACC", 04, 35, 76000));
		map.put(05, new Employee("CCC", 05, 40, 82000));
		
		/*
		 * Without Lembda
		 */
		BiConsumer<Integer, Employee> consumer = new BiConsumer<Integer, Employee>() {
			
			@Override
			public void accept(Integer t, Employee u) {
				System.out.println("Without Lembda	Employee Details: "+u.toString());
				
			}
		};
		
		map.forEach(consumer);
		
		/*
		 * With Lembda
		 */
		BiConsumer<Integer, Employee> consumer1 = (t, u) ->
			System.out.println("With Lembda	Employee Details: "+u.toString());
		map.forEach(consumer1);
		
		//OR
		
		map.forEach((t, u) ->
		System.out.println("With Lembda	Employee Details: "+u.toString()));
	}

}
