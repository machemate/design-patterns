package com.interview.problems;

import java.util.Arrays;

public class SumOfSubmatrix {

	public static void main(String[] args) {

		int[][] input = new int[4][4];
		// Filling all elements as 1
		Arrays.fill(input[0], 1);
		Arrays.fill(input[1], 1);
		Arrays.fill(input[2], 1);
		Arrays.fill(input[3], 1);

		System.out.println(sum(1, 1, 3, 3, input));

	}

	private static int sum(int x1, int y1, int x2, int y2, int[][] input) {
		int sum = 0;
		for (int i = x1; i <= x2; i++) {

			for (int j = y1; j <= y2; j++) {

				sum = sum + input[i][j];
			}

		}

		return sum;
	}

}
