package interviewPrepJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;

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
	
	
	static void findMissingNumber(int[] arr) {
		int missingNumber = 0;
		Arrays.sort(arr);
		for(int i=0; i < arr.length-1; i++) {
			int first = arr[i];
			int second = arr[i+ 1];
			if((first+1)!=second) {
				
				missingNumber = first+1;
				break;
			}
			
		}
		System.out.println(missingNumber);		
	}
	
	         
	   static void findDuplicateNumbers(int[] arr) {
		   //4, 3, 2, 7, 8, 2, 3, 1
		   
		   HashMap<Integer, Integer> map = new HashMap<>();
		   
		   for(int i=0; i <arr.length-1; i++) {
			   
			   map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			   
			   
		   }
		 //  System.out.println(map.entrySet());
		   
		   for(Entry<Integer, Integer> entry : map.entrySet()) {
			   if(entry.getValue()>1) {
				   System.out.println(entry.getKey());
			   }
		   }
		   
		 
	   }
	   
	   static String generateRandomAlphaNumeric10(int length) {
		   final String alphaNumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		   Random random = new Random();
		   StringBuilder sb = new StringBuilder(length);
		   for(int i=0; i<length; i++) {
			   int randomIndex = random.nextInt(alphaNumeric.length());
			   sb.append(alphaNumeric.charAt(randomIndex));
			   
		   }
		   return sb.toString();
		  
	   }
	
	   static void extractUserDetails() {
		   List<String> li = new ArrayList<>();
		   li.add("[2025-09-09 10:15:23] INFO User:John Action:Login");
		   li.add("[2025-09-09 10:17:05] INFO User:Mary Action:Upload");
		   li.add("[2025-09-09 10:20:10] INFO User:John Action:Logout");
		   
		   for(int i=0; i<li.size(); i++) {
		   String[] user = li.get(i).split(" ");
		   String username = user[3].split(":")[1];
		   String action = user[4].split(":")[1];
		   System.out.println(username + " -> " + action);
		   }
	   }
	   
	   
	   static void assertEquals(String expected, String actual) {
		   if(expected.equals(actual)) {
			   System.out.println("PASS: expected and actual match: <"+actual+">");
		   }
		   else {
			   System.out.println("FAIL: expected <"+ expected +"> but got <"+ actual +">");
		   }
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
		//findFirstNonRepeatingChar("swiss");
	//	findFirstNonRepeatingChar("aabbcc");

		
		/*
	You are given an array of size n containing numbers from 1 to n+1, but one number is missing.
Write a function in Java to find the missing number.

Example:
Input: [1, 2, 4, 5, 6]
Output: 3
		 */
		int[] arr = {1, 2, 4, 5, 6};
	//	findMissingNumber(arr);
		
		
/*
 Write a Java function to print all duplicate numbers in the array.

Example:
Input: [4, 3, 2, 7, 8, 2, 3, 1]
Output: 2 3		
 */
		int[] arr1 = {4, 3, 2, 7, 8, 2, 3, 1};
	//	findDuplicateNumbers(arr1);
		
		
		/*
Write a Java method that generates a random 10-character alphanumeric string (letters + digits) — for example, for creating test user IDs or passwords.

Example output:
A7B93ZK1XQ
		 */
	//	System.out.println(	generateRandomAlphaNumeric10(10));
	
	/*
You’re testing a backend service. You get logs like this:

[2025-09-09 10:15:23] INFO User:John Action:Login
[2025-09-09 10:17:05] INFO User:Mary Action:Upload
[2025-09-09 10:20:10] INFO User:John Action:Logout


Write a Java method that:

Takes the log lines as a List<String>.

Extracts each User and their Action.

Prints them like:	
John -> Login

	 */
	//	extractUserDetails();
		
		
		/*
		 * Imagine you’re building your own lightweight assertion library for test automation (like a tiny version of TestNG or JUnit).
Write a Java utility method called assertEquals which:

Accepts two String parameters: expected and actual.

If they are equal, prints:

PASS: expected and actual match: <value>


If they are not equal, prints:

FAIL: expected <expected> but got <actual>

		 */
		
		assertEquals("Hello", "Hello");
		assertEquals("Test", "test");
	

		
}
}

