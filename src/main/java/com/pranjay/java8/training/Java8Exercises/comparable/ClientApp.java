package com.pranjay.java8.training.Java8Exercises.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClientApp {

	public static void main(String[] args) {
		
		List<Employee2> empList = new ArrayList<>();
		empList.add(new Employee2("DDD", 01, 20, 50000));
		empList.add(new Employee2("ABB", 02, 28, 40000));
		empList.add(new Employee2("ACB", 03, 30, 60000));
		empList.add(new Employee2("ABB", 04, 35, 76000));
		empList.add(new Employee2("CCC", 05, 40, 82000));
		System.out.println();
		empList.forEach(System.out::println);
		Collections.sort(empList);
		empList.forEach(System.out::println);
	}

}
