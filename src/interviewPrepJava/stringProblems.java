package interviewPrepJava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class stringProblems {

	
	static void reverseString(String s) {
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
	}
	
	static void palindromeCheck(String s) {
		StringBuffer sb = new StringBuffer(s);
		System.out.println(s.length()>=3 && s.equalsIgnoreCase(sb.reverse().toString()));	
	}

	static void duplicateChar(String s) {
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
		
		}
		
		for(Entry<Character,Integer> entry: map.entrySet()) {
			if(entry.getValue()>1) {
			
			System.out.println(entry.getKey());
			}
		}
		
	}
	 
	static void removeWhiteSpaces(String s) {
//	s = s.trim();	
//		System.out.println(s);
		
		String result = s.replaceAll("\\s", "");
		System.out.println(result);
		
	}
	
	static void firstNonRepeatedCharacter(String s) {
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(char c: s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				break;
			}
		}
//		System.out.println(map.entrySet().stream()
//				.filter(e -> e.getValue()==1)
//				.findFirst());
//		
		
	}
	
	static void checkIfItsAnagrams(String s1, String s2) {
		if(s1.length()==s2.length()) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
	 System.out.println(	Arrays.equals(c1, c2));
	
		}
		else System.out.println("Not anagrams");
		
	}
	
	static void CharOccurenceCount(String s, char c) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for( char c1 : s.toCharArray()) {
			map.put(c1, map.getOrDefault(c1, 0)+1);
		}
		
		for(Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getKey().equals(c)) {
				System.out.println(entry.getValue());
			}
		}
		
	}
	
	static void convertStringToIntWithInbuilt(String s) {
		
		int num = Integer.parseInt(s);
		System.out.println(num);
	}
	
	static void convertStringToIntWithoutInbuilt(String s) {
		int num = 0;
		for (char c : s.toCharArray()) {
			num = num * 10 + Character.getNumericValue(c);
		}
		System.out.println(num);
		
	}
	
	
	static void containsString(String s1, String s2) {
		
		System.out.println(s1.contains(s2));
		
	}
	
	static void replaceAllOccurance(String s, char c) {
		s = s.replace(c, 'm');
		System.out.println(s);
	}
	
	static void splitStringDelimiter(String s) {
		String[] words = s.split(" ");
	for(String word: words) {
		System.out.println(word);
	}
		
	//	Arrays.stream(words).forEach(e -> System.out.println(e));
		
		
	}
	
	static void sortCharInString(String input) {
		
		char[] arr = input.toLowerCase().toCharArray();
		Arrays.sort(arr);
		System.out.println(arr); // aajv
	}
	
	static void longestWordInSentence(String s) {
	
		String[] words = s.split(" ");
	//	String longest = Arrays.stream(words).max(Comparator.comparing(String::length)).orElse("");
	//	System.out.println(longest);
		
		 if (words.length == 0 || (words.length == 1 && words[0].isEmpty())) {
		        System.out.println(""); 
		    }
		 String longestWord = ""; 
		 for (String word : words) {
		         if (word.length() > longestWord.length()) {
		            longestWord = word; 
		        }
		    }
		 System.out.println(longestWord);
		
	}
	
	static void repeatedWordsFind(String s) {
		HashMap<String, Integer> map = new HashMap<>();
		
		for(String word: s.split(" ")) {
			map.put(word, map.getOrDefault(word, 0)+1);
		}
		
	//	map.entrySet().stream().filter(e-> e.getValue()>1).forEach(e -> System.out.println(e.getKey()));
		
		for(Entry<String, Integer> entry: map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() + " - " + entry.getValue() + " times ");
			}
		}
		
	}
	public static void main(String[] args) {
	//		reverseString("mathu");
//	
//		palindromeCheck("mom");
//		palindromeCheck("mathu");
//		palindromeCheck("madam");
//		palindromeCheck("0");
//		palindromeCheck("");
		
	//	duplicateChar("programming");
	//	removeWhiteSpaces(" My name is Mathu          ");
		
	//	firstNonRepeatedCharacter("swiss");
		
	//	checkIfItsAnagrams("god","dog");
	//	checkIfItsAnagrams("mathu","mathi");
		
	//	CharOccurenceCount("banana", 'a');
	//	convertStringToIntWithInbuilt("2334");
	//	convertStringToIntWithoutInbuilt("2334");
	
	//	containsString("Hello India", "India");
		
		//replaceAllOccurance("banana", 'a');
		
	//	splitStringDelimiter("my name is mathumathi");
		
	//	sortCharInString("Java");
		
	//	longestWordInSentence("Java is a beautiful language");
		
		repeatedWordsFind("Java is great and Java is powerful");
	}

}
