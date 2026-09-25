package mathsforDSA;

public class PrimeNumber {
	public static void main(String[] args) {
		int n = 20;
		
		boolean[] arr = new boolean[n + 1];
		
		PrimeTillN(n, arr);
	}
	
	static boolean isPrime(int n) {
		// n should be divided by only one and itself
		for(int i = 2 ; i < n - 1 ; i++) {
			if( n % i == 0 ) {
				return false;
			}
		}
		return true;
	}
	
	// for Optimized solution we can just search till our root of out number from i = 2
	// as we get same number repeating in multiplication after a root of a number
	static boolean isPrimeOptimized(int n) {
		int i = 2;
		
		while(i < Math.sqrt(n)) {
			if(n % i == 0) {
				return false;
			}
			i++;
		}
		
		return true;
	}
	
	static void PrimeTillN(int n , boolean[] arr) {
		// FInding Elements in Array that are boolean
		for(int i = 2 ; i*i <= n ; i++) {
			if(!arr[i]) {
				for(int j = i*2 ; j <= n ; j += i) {
					arr[j] = true;
				}
			}
		}
		
		for(int i = 2 ; i <= n ; i++) {
			if(!arr[i]) {
				System.out.println(i + " ");
			}
		}
	}
}
