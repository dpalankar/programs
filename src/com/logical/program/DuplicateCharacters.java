package com.logical.program;

import java.util.HashSet;
import java.util.Set;

//Program to find the duplicate characters in a string.
public class DuplicateCharacters {

	public static void main(String[] args) {
		String word = "Sakkettt";
		Set<Character> duplicates = new HashSet<>();
		for (int i = 0; i < word.length(); i++) {
			int defaultVal = i + 1;
			for (int j = defaultVal; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j)) {
					duplicates.add(word.charAt(i));
				}
			}
		}
		System.out.println("Duplicate " + duplicates.toString());
	}

}
