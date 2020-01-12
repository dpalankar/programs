package com.logical.program;

//Program to find the second highest number in an array.
public class SecondHighestNumberInArray {

	public static void main(String[] args) {
		int[] numbers = { 1, 5, 8, 45, 89, 6, 87 };
		int largest = 0, secondLargest = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				secondLargest = largest;
				largest = numbers[i];
			} else if (numbers[i] > secondLargest) {
				secondLargest = numbers[i];
			}
		}
		System.out.println("Largest " + largest);
		System.out.println("Second Largest " + secondLargest);
	}

}
