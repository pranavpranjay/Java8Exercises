package com.pranjay.java8.training.Java8Exercises.streamsApi;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Java program to demonstrate how to use Java 8 Stream API with simple
 * Examples like filter objects, transforming objects and creating subsets.
 * @author Pranjay
 *
 */

public class StreamExercise2 {

	public static void main(String[] args) {
		
		//Count the empty strings
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		long count = strList.stream().filter(x -> x.isEmpty()).count();
		System.out.printf("List %s has %d empty strings %n", strList, count);
		
		// Count String with length more than 3
		List<String> strList1 = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		long num = strList1.stream().filter(x -> x.length()> 3).count();
		System.out.printf("List %s has %d strings of length more than 3 %n", strList1, num);
		
		// Count number of String which startswith "a"
		List<String> strList2 = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		count = strList2.stream().filter(x -> x.startsWith("a")).count();
		System.out.printf("List %s has %d strings which startsWith 'a' %n", strList2, count);
		
		// Remove all empty Strings from List
		List<String> strList3 = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		List<String> filtered = strList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
		System.out.printf("Original List : %s, List without Empty Strings : %s %n", strList3, filtered);

		// Create a List with String more than 2 characters
		List<String> strList4 = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		filtered = strList4.stream().filter(x -> x.length()> 2).collect(Collectors.toList());
		System.out.printf("Original List : %s, filtered list : %s %n", strList4, filtered);
		
		//Remove Duplicate
		List<Integer> numList = Arrays.asList(1,3,7,6,5,3,4,1);
		List<Integer> distinctList = numList.stream().distinct().collect(Collectors.toList());
		System.out.println("distinctList: "+distinctList.toString());
		
		
		// Convert String to Uppercase and join them using coma
		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
		String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(G7Countries);
		
		// Create List of square of all distinct numbers
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		List<Integer> distinct = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		System.out.printf("Original List : %s, Square Without duplicates : %s %n", numbers, distinct);
		
		//Get count, min, max, sum, and average for numbers
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println("Highest prime number in List : " + stats.getMax());
		System.out.println("Lowest prime number in List : " + stats.getMin());
		System.out.println("Sum of all prime numbers : " + stats.getSum());
		System.out.println("Average of all prime numbers : " + stats.getAverage());

		

	}

}
