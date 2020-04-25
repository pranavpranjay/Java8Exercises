package com.pranjay.java8.training.Java8Exercises.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ComparatorImplUsingLembda {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee("DDD", 01, 20, 50000));
		empList.add(new Employee("ABB", 02, 28, 40000));
		empList.add(new Employee("ACB", 03, 30, 60000));
		empList.add(new Employee("AAA", 04, 35, 76000));
		empList.add(new Employee("CCC", 05, 40, 82000));
		List<Employee> empList2 = new ArrayList<>(empList);
		
		System.out.println("No Sorting..");
		empList.forEach(System.out::println);
		
		System.out.println("With Sorting");
		Collections.sort(empList, new SortByName());
		empList.forEach((t) -> System.out.println(t));
		//OR
		//empList.forEach(System.out::println);
		
		/*
		 * Using lembda
		 */
		System.out.println("************Without Sort*******");
		empList2.forEach(System.out::println);
		System.out.println("************With Sort*******");
		Collections.sort(empList2, (o1,  o2) ->
				o1.getName().compareTo(o2.getName()));

		empList2.forEach(System.out::println);

	}

}
