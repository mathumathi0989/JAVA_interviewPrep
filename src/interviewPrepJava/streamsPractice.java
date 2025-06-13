package interviewPrepJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class streamsPractice {

	
	
	static void reverseStreams(String s) {
		String reverse = new StringBuffer(s).reverse().toString();
		System.out.println(reverse);
	}
	
	static void palindromeStreams(String s) {
		String reverse = new StringBuffer(s).reverse().toString();
		System.out.println(s.length()>=3 && s.equalsIgnoreCase(reverse));		
	}
	
	
	static void duplicateCharacterStreams(String s) {
		Map<Character,Integer> map = new HashMap<>();
		
		for(char c: s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		map.entrySet().stream()
		.filter(e -> e.getValue()>1)
		.forEach(e -> System.out.println(e.getKey()));
		
	}
	
	static void checkAnagramsStreams(String s1, String s2) {
		
		boolean isAnagram = s1.length()==s2.length() && Arrays.equals(s1.chars().sorted().toArray(), s2.chars().sorted().toArray());
		
		System.out.println(isAnagram);
		
		
	}
	
	static void charCountStreams(String s, char c) {
		
	 long count = s.chars().filter(e -> e==c).count();
	 
		System.out.println(count);
	}
	
	public static void main(String[] args) {
	
//
//		reverseStreams("mathu");
//		
//		palindromeStreams("mom");
//		palindromeStreams("mathu");
//		palindromeStreams("madam");
//		palindromeStreams("0");
//		palindromeStreams("");
		
	//	duplicateCharacterStreams("programming");
		
	//	checkAnagramsStreams("dog","god");
	//	checkAnagramsStreams("mathu", "mathi");
		
		charCountStreams("banana", 'a');
		
	}

}
