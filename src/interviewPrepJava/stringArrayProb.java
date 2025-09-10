package interviewPrepJava;

public class stringArrayProb {

	
	//Write a method in Java to reverse a string without using built-in functions like StringBuilder.reverse() or Collections.reverse().
	
	
	static void reverseWithoutStreams(String s) {
		String s1 = "";
		for(int i=s.length()-1; i>=0; i--) {
		
		s1 = s1 + s.charAt(i)	;
	
		}
		System.out.println(s1);
		}
	
	static void reverseWithStreams(String s) {
		
		String sb = new StringBuilder(s).reverse().toString();
	System.out.println(sb);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reverseWithoutStreams("mathu");
		reverseWithStreams("mathi");
		
		
	}
	
	
	

}
