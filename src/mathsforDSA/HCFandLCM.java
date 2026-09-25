package mathsforDSA;

public class HCFandLCM {
	
	// A> HCF or GCD - greatest no that divides both Number
			// 1. Using Recursion
		static int gcd(int a , int b) {
			if(a == 0) {
				return b;
			}
			
			return gcd(b%a , a);
		}
		
			// 2. Using Loop
		static int gcdLoop(int a , int b) {
			while(a > 0) {
				int temp = a;
				a = b%a;
				b = temp;
			}
			
			return b;
		}
		
	// B> LCM - Smallest Number that is divided by both
		// Formulae : HCF * LCM = A*B
		static int Lcm(int a , int b) {
			// using above formulae
			return a*b / gcd(a,b);
		}
	
	public static void main(String[] args) {
		int a = 18;
		int b = 24;
		
		System.out.println(gcdLoop(a,b));
		System.out.println(Lcm(a,b));
	}
}
