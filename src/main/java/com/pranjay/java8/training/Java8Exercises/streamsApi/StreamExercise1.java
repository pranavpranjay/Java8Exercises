package com.pranjay.java8.training.Java8Exercises.streamsApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExercise1 {

	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(2, 5, 4, 3);
		
		// Length of list
		System.out.println("Count of List: "+numList.stream().count());
		
		// Sort the array
		numList.stream().sorted().forEach(System.out::println);
		// OR
		// numList.stream().sorted().forEach((i) -> System.out.println(i));
		
		// To square of each element of a list
		numList.stream().map(i -> i*i).forEach(System.out::println);
		
		// To add all list elements
		System.out.println(numList.stream().reduce(0, (t, u) -> t + u));
		
		
		//Collect():	Used to convert stream to Collections(List/Set/Map)
		
		ArrayList<Integer> newNumList = numList.stream()
		      .collect(Collectors.toCollection(ArrayList::new));
		System.out.println("New ArrayList: "+newNumList);
		
		Set<Integer> sets = numList.stream().collect(Collectors.toSet());
		System.out.println("Stream into Set: "+sets.toString());
		
		/*Map<Integer, Integer> maps = numList.stream().collect(
				Collectors.toMap(Function.identity(), Integer));
		System.out.println("Stream into Map: "+maps.toString());*/
		
	}

}
