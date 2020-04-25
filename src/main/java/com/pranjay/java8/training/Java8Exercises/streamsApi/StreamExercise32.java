package com.pranjay.java8.training.Java8Exercises.streamsApi;

import java.util.Arrays;
import java.util.List;

public class StreamExercise32 {

	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(2, 3, 4, 5);

		//Function<Integer, Integer> f = i -> i * 1;
		//Stream<Integer> s = numList.stream();
		//Stream<Integer> s2 = s.map(i -> i * 1);

		//BinaryOperator<Integer> b = (t, u) -> t + u;
		//Integer it = (Integer) s2.reduce(0, (t, u) -> t + u);
		// System.out.println(it);

		
		//System.out.println(s2.reduce(0, (t, u) -> t + u));
		//System.out.println(s.map(i -> i * 1).reduce(0, (t, u) -> t + u));
		//System.out.println(numList.stream().map(i -> i * 1).reduce(0, (t, u) -> t + u));
		
		// To square of each element of a list
		numList.stream().map(i -> i*i).forEach(System.out::print);
		
		// To add all list elements
		System.out.println(numList.stream().reduce(0, (t, u) -> t + u));
		
		
		// if we want to do some extra logic before processing then can use map()
		// Ex - If required a sum of square of each elements
		//System.out.println(numList.stream().map(i -> i * i).reduce(0, (t, u) -> t + u));

	}

}
