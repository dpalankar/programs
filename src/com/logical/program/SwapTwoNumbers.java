package com.logical.program;

//Program to swap two numbers with using the third variable.
public class SwapTwoNumbers {

	public static void main(String[] args) {
		int x =10;
		int y =20;
		System.out.println("Before Swaping X= "+x+" Y= "+y);
		int temp;
		temp = x;
		x=y;
		y=temp;
		System.out.println("After  Swaping X= "+x+" Y= "+y);
	}

}
