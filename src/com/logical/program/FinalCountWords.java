package com.logical.program;

import java.util.HashMap;
import java.util.Map;

//Program to count the number of words in a string using HashMap.
public class FinalCountWords {

	public static void main(String[] args) {
		String sentence="Hi Deepak How are you Deepak";
		String[] splitsent = sentence.split(" ");
		Map<String,Integer> countWord = new HashMap<>();
		for (String word : splitsent) {
			if(countWord.containsKey(word)){
				countWord.put(word, countWord.get(word)+1);
			}else{
				countWord.put(word, 1);
			}
		}
		
		System.out.println("countWord "+countWord.toString());
	}

}
