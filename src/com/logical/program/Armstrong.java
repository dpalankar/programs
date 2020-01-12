package com.logical.program;

//Program to check Armstrong number.
//153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
//1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1 + 1296 + 81 + 256 = 1634
public class Armstrong {
	public static void main(String[] args) {
		int number = 153;
		int orignum = number;
		int sum = 0;
		int power = String.valueOf(number).length();
		while (number != 0) {
			int digit = number % 10;
			sum = (int) (sum + Math.pow(digit, power));
			// sum = sum + (digit * digit * digit);
			number = number / 10;
		}
		if (orignum == sum) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}
	}

}
