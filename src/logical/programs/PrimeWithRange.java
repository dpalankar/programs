package logical.programs;

import java.util.ArrayList;
import java.util.List;

//Program to find prime list from range. 
public class PrimeWithRange {
	public static void main(String[] args) {
		int x = 100;
		List<Integer> primes = new ArrayList<>();
		for (int i = 2; i <= x; i++) {
			int count = 0;
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println("Prime " + i);
				primes.add(i);
			}
		}
	}
}
