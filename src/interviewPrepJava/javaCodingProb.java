package interviewPrepJava;

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
//		if (word.equals(temp)) {
//			return true;
//		}
		}
		
		
		return false;
	}
	
	
	public static void main(String[] args) {
	//	System.out.println("Hello world");
		javaCodingProb code = new javaCodingProb();
	//	code.reverse("letcode");
		System.out.println(code.palindrome("madam"));
		System.out.println(code.palindrome("nurses run"));
		System.out.println(code.palindrome("mathu"));
		
		
	}
}
