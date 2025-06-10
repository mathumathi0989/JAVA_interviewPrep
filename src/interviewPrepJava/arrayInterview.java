package interviewPrepJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arrayInterview {

	
	
	/*
	Jagdish Gudipalle

10:54 AM
Write a program to accept user defined integer arrays.

Merge both the arrays.

Display the output in single array with ascending order.

Jagdish Gudipalle

10:54 AM
 Eg.

User input array 1 : (20, 30, 40)

User input array 2 : (10, 35, 25)

 Output should be : (10, 20, 25, 30, 35, 40)
	 */
	
	
	  static void mergeArrayUsingList(Integer[] arr1,Integer[] arr2) {
	     

	        List<Integer> list = new ArrayList<>(Arrays.asList(arr1));
	        list.addAll(Arrays.asList(arr2));

	        System.out.println(list);
	      Collections.sort(list);
	        System.out.println(list);
	    }

	  static void mergeArrayWithoutList(Integer[] arr1,Integer[] arr2) {
		Integer[] arr3 = new Integer[arr1.length + arr2.length];
		
		int i=0;
		for(int each: arr1) {
			arr3[i++] = each;
		}
		for(int each: arr2) {
			arr3[i++] = each;
		}
		System.out.println(Arrays.toString(arr3));
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
	  }
	    public static void main(String[] args) {
	    	   Integer[] arr1 = {20, 30, 40};
		        Integer[] arr2 = {10, 35, 25};
		     //   mergeArrayUsingList(arr1,arr2);
		       mergeArrayWithoutList(arr1,arr2);
	    }

}
