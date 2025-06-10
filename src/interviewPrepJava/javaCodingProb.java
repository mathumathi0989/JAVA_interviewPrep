package interviewPrepJava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class javaCodingProb {

	
	//Reverse the given string
	private void reverse(String word) {
		String temp = "";
		for(int i=word.length()-1; i>=0; i--) {
			temp = temp + word.charAt(i);
		}
		System.out.println(temp);
	}
	
	
	//palindrome check
	private boolean palindrome(String word) {
		
		word = word.replace(" ", "");
		
		if(word.length()>=3) {
			
		String temp = "";
		for(int i= word.length()-1; i>=0; i--) {
			temp = temp + word.charAt(i);
		}
		
		return word.equalsIgnoreCase(temp);
		}
		return false;
	}
	
	
	//find number of words in a given string 
	int countWords(String sentence) {
		
		String[] word = sentence.trim().split(" ");
	
		int count = 0;
		for(int i =0; i<word.length; i++) {
			System.out.println(word[i]);
			count++;
			
		}
		
		return count;	
	}
	
	//find number of each character in a given string
	void charCount(String word) {
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<word.length(); i++) {
			char ch = word.charAt(i);
			if(ch==' ') continue;
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(Entry<Character, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey() +":" + entry.getValue());
		}
	
	}
	
	//Remove duplicate word in the given string 
	void removeDuplicateWord(String sentence) {
		String[] words = sentence.trim().split(" ");
		Map<String, Integer> map = new LinkedHashMap();
		for(int i=0; i<words.length; i++) {
			String s = words[i];
			map.put(s, map.getOrDefault(s, 0)+1);
		}
		for(Entry<String, Integer> entrySet: map.entrySet()){
			if(entrySet.getValue()==1) {
				System.out.print(entrySet.getKey() + " ");
			}
		}
	}
	
	//find permutation in the given string
	void findPermutation(String word) {
		
		
	}
	
	public static void main(String[] args) {
	//	System.out.println("Hello world");
		javaCodingProb code = new javaCodingProb();
	//	code.reverse("letcode");
//		System.out.println(code.palindrome("madam"));
//		System.out.println(code.palindrome("nurses run"));
//		System.out.println(code.palindrome("mathu"));
	//	System.out.println(code.countWords("hey, happy to see you here"));
		//code.charCount("subscribe to letcode");
		code.removeDuplicateWord("bat man super man");
		code.findPermutation("let");
		
	}
}
