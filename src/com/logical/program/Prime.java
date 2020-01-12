package com.logical.program;

//Program to find whether a number is prime or not.
public class Prime {
	public static void main(String[] args) {
		int x = 7;
		int count = 0;
		for (int i = 2; i <= x; i++) {
			if (x % i == 0) {
				count++;
			}
		}
		if (count == 1) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}
}
