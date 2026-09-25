package mathsforDSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Factors {
	static List<Integer> factors(int n){
		
		List<Integer> ans = new ArrayList<>();
		
		if(n <= 1) {
			ans.add(1);
			return ans;
		}
		
//		for(int i = 1 ; i <= n ; i++) {
//			if(n % i == 0) {
//				ans.add(i);
//			}
//		}
		
		
		// TO OPTIMIZE IT WE CAN SEARCH TILL ROOT N ONLY
		for(int i = 1 ; i * i <= n ; i++) {
			if(n % i == 0) {
				if(i == n/i) {
					ans.add(i);
				}else {
					ans.add(i);
					ans.add(n/i);  // i.e 3*5 = 15 so 15/3 = 5 also valid					
				}
			}
		}
		
		Collections.sort(ans);
		
		return ans;
	}
	
	public static void main(String[] args) {
		int n = 16;
		
		System.out.println(factors(n));
	}
	
}
