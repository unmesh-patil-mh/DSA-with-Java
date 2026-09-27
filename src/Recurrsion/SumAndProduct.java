package Recurrsion;

public class SumAndProduct {
	static int sum(int n) {
		if(n == 0) {
			return 0;
		}
		
		return (n % 10) + sum(n/10);
	}
	
	static int product(int n) {
		if(n == 0) {
			return 1;
		}
		
		return (n % 10) * product(n/10);
	}
	
	public static void main(String[] args) {
		System.out.println(sum(1111));
		System.out.println(product(1234));
	}
}
