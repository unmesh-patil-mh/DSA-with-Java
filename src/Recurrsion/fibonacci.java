package Recurrsion;

public class fibonacci {
	static int fib(int n) {
		if( n < 2) return n;
		
		return fib(n - 1) + fib(n - 2);
		
	}
	
	public static void main(String[] args) {
		int n = 15;
		
		int ans = fib(n);
		
		System.out.println(ans);
	}
}
