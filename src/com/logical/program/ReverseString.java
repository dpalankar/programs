package com.logical.program;

import java.util.Scanner;

//reverse a string without using String inbuilt function reverse().
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original, reverse = "";
		System.out.println("Enter the string to be reversed");
		Scanner in = new Scanner(System.in);
		original = in.nextLine();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		System.out.println(reverse);
	}

}
