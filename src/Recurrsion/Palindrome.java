package Recurrsion;

public class Palindrome {
	// 1. REVERSING A NUMBER
	static int sum = 0;
	
	static void rev(int n) {
		if(n == 0) {
			return;
		}
		
		int rem = n % 10;
		
		sum = sum * 10 + rem;
		
		rev(n / 10);
	}
	
	static boolean isPali(int n , int sum) {
		return n == sum;
	}
	
	public static void main(String[] args) {
		
		int n = 2321;
		rev(n);
		
		System.out.println(isPali(n,sum));
			
	}
}
