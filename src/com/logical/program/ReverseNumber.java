package com.logical.program;

import java.util.Scanner;

//reverse a Number without using String inbuilt function reverse().
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int original, reverse = 0;
		System.out.println("Enter the string to be reversed");
		Scanner in = new Scanner(System.in);
		original = in.nextInt();
		System.out.println("original : "+original);
		while (original != 0) {
			int append = original % 10;
			if (reverse == 0) {
				reverse = append;
			} else {
				reverse = reverse * 10 + append;
			}
			original = original / 10;
		}
		
		System.out.println("reverse  : "+reverse);
	}

}
