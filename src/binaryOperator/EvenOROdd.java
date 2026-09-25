package binaryOperator;

public class EvenOROdd {
	// check last binary digit if 1 then odd or even 
	// so perform and operation with 1 as and with one return number itself
	
	static void EvenOdd(int n) {
		if((n & 1) == 1) {
			System.out.println("The Number is Odd");
		}else {
			System.out.println("The Number is Even");
		}
	}
	
	public static void main(String[] args) {
		int n = 17;
		
		EvenOdd(n);
	}
}
