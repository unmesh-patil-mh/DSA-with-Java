package mathsforDSA;

public class SquareRoot {
	static int sqrt(int n) {
		// Using Binary Search
		int start = 0;
		int end = n; 
		int ans = 0;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(mid * mid == n) {
				return mid;
			}
			
			if(mid * mid < n) {
				ans = mid;
				start = mid + 1;
			}
			
			else {
				end = mid - 1;
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		int n = 40;
		
		System.out.println(sqrt(n));
	}
}
