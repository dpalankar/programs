package com.logical.program;

//Program to find whether a string or number is palindrome or not.
public class Palindrome {
	public static void main(String[] args) {
		String original = "NINE";
		String reverse = "";
		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		if (original.equals(reverse)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}
}
