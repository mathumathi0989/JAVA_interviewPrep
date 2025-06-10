package interviewPrepJava;

public class javaPractice2 {

	//https://www.youtube.com/watch?v=K4MZqwYktUs&list=PLLS0D9-W-1dmoSD9D-h0LxLSytAgyGDSB
	
	//find the number is prime or not
	
	static boolean isPrime(int num) {
		if(num<=1) return false;
		
		for(int i=2; i<num/2; i++) {
			if(num%i == 0) return false;
			
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		System.out.println(	isPrime(13));
	
	}
}
