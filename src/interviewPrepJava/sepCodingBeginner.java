package interviewPrepJava;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class sepCodingBeginner {

	
	static boolean palindromeCheck(String word) {
		String result = "";
		for(int i = word.length()-1; i>=0; i--) {
			result = result + word.charAt(i);
	
		}
		 return word.equals(result);
	}
	
	
	static void maxArray(int[] arr) {
		
		int largest = arr[0];
		
		for(int i = 1; i<arr.length; i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
			
		}
		System.out.println(largest);
	}
	
	static void countEachChar(String word) {
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		
		for(char ch: word.toCharArray()) {
		map.put(ch, map.getOrDefault(ch, 0)+1);
		
		}
		
		for(Entry<Character,Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}
		
	}
	
	
	static void isIntegerArraySorted(int[] arr) {
	
	int[] sorted = Arrays.copyOf(arr, arr.length);
	Arrays.sort(sorted);
	
	if(Arrays.equals(arr, sorted)) {
		System.out.println("true");
	}
	else System.out.println("false");
		
	}
	
	static void isIntegerArrayInAscending(int[] arr) {
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				System.out.println("false");
				return;
			}
			
			
		}
		System.out.println("true");
	}
	
	static void mergeAndSortArray(int[] arr, int[] brr) {
		
		int[] mergeArray = new int[arr.length + brr.length];
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(brr));
		System.arraycopy(arr, 0, mergeArray, 0, arr.length);
		System.arraycopy(brr, 0, mergeArray, arr.length, brr.length);
		System.out.println(Arrays.toString(mergeArray));
		Arrays.sort(mergeArray);
		System.out.println(Arrays.toString(mergeArray));
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
Write a function in Java (or Python if you prefer) that checks if a given string is a palindrome (same forward and backward).
Example: "madam" → true, "hello" → false.
		 */
		
		System.out.println(palindromeCheck("madam"));
		System.out.println(palindromeCheck("hello"));
			
		
		/*
Write a function in Java that finds the maximum number in an integer array.
Example:
Input: [3, 7, 2, 9, 5]
Output: 9
		 */
		
		int[] arr = {3,7,2,9,5};
	
		maxArray(arr);
		
		
		
		/*
Write a function in Java that counts how many times each character appears in a given string.

Example:
Input: "banana"
Output:

b → 1  
a → 3  
n → 2 
		 */
		
		countEachChar("banana");
		
		/*
Write a function in Java to check if an integer array is sorted in ascending order.

Example 1:
Input: [1, 2, 3, 4, 5] → Output: true

Example 2:
Input: [3, 1, 4, 2] → Output: false
		 */
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {3,1,4,2};
		isIntegerArraySorted(arr1);
		isIntegerArraySorted(arr2);
		
		System.out.println("---------------------------------------");
		isIntegerArrayInAscending(arr1);
		isIntegerArrayInAscending(arr2);
		
		System.out.println("---------------------------------------");
		mergeAndSortArray(arr1, arr2);
		
		
		
	}
		
	}

