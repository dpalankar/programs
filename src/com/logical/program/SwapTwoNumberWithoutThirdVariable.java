package com.logical.program;

//Program to swap two numbers without using the third variable.
public class SwapTwoNumberWithoutThirdVariable {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println("Before Swaping X= " + x + " Y= " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After  Swaping X= " + x + " Y= " + y);

	}

}
