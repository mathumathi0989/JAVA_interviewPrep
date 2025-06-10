package interviewPrepJava;

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
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		
	}

}
