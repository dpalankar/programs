package com.logical.program;

//Program to find whether a string or number is palindrome or not.
public class PalindromeNumber {

	public static void main(String[] args) {
		int original = 1221;
		int x = original;
		int reverse = 0;
		while (x != 0) {
			if (reverse == 0) {
				reverse = x % 10;
			} else {
				reverse = reverse * 10 + x % 10;
			}
			x = x / 10;
		}
		if (original == reverse) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}

}
