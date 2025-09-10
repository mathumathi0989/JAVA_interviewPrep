package interviewPrepJava;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class sepCodingIntermediate {

	
	static void findFirstNonRepeatingChar(String word) {
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
		
		for(char ch : word.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		//System.out.println(map.entrySet());
		
		for(Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue()==1) {
			System.out.println(entry.getKey());
		return;
			}
			
		}
		System.out.println("no non repeating character");
			
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
Write a function in Java to find the first non-repeating character in a string.

Example 1:
Input: "swiss" → Output: "w"

Example 2:
Input: "aabbcc" → Output: null (or say "no non-repeating character")		
 */
		findFirstNonRepeatingChar("swiss");
		findFirstNonRepeatingChar("aabbcc");

		
		/*
	You are given an array of size n containing numbers from 1 to n+1, but one number is missing.
Write a function in Java to find the missing number.

Example:
Input: [1, 2, 4, 5, 6]
Output: 3
		 */
		
		
		
		
		
		
		
		
		
		
		
	}

}
