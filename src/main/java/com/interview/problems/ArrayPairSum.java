package com.interview.problems;

import java.util.*;

/**
 * Problem:<br>
 * Find all pair of elements from array for which sum is 12.
 *
 * @author Manoj Chemate
 *
 */
public class ArrayPairSum {

	private int sum = 12;
	
	private Set<Integer> set = new HashSet<>();

	public static void main(String[] args) {

		int[] input = { 5, 1, 2, 6, 7, 6,2,10 };

		Arrays.stream(input).forEach(new ArrayPairSum()::printPair);
	}

	public void printPair(int x) {

		if (set.contains(sum - x)) {
			System.out.println("Pair is:" + (sum - x) + "," + x);
		} else {
			set.add(x);
		}
	}

}
