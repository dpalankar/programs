package com.logical.program;

/*Program for Fibonacci series.
For Example 0,1,1,2,3,5,8,13,21………*/
public class Fibonacci {

	public static void main(String[] args) {
		int limit = 9;
		int a=0,b=0,c=1,sum=0;
		for (int i = 0; i <= limit; i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+""+b+""+c);
			System.out.println("="+a);
		}
	}

}
