package recurrsionQuestions;

import java.util.ArrayList;
import java.util.List;

public class C_AllSubsets {
	static void subset(String p , String up) {
		if(up.isEmpty()) {
			System.out.print(p + " ");
			return;
		}
		
		char ch = up.charAt(0);
		
		// Now Just Run Two Conditions
		subset(p + ch , up.substring(1));
		subset(p , up.substring(1));
	}

	
	// IF WE WANT TO DISPLAY ANS IN LIST
	static List<String> subset1(String p , String up){
		if(up.isEmpty()) {
			List<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		
		char ch = up.charAt(0);
		
		List<String> left = subset1(p , up.substring(1));
		List<String> Right = subset1(p + ch , up.substring(1));
		
		left.addAll(Right);
		
		return left;
		
	}
	
	public static void main(String[] args) {
		String str = "abc";
		
		subset("" , str);
		
		System.out.println();
		
		List<String> ans = subset1("" , str);
		
		System.out.println(ans);
	}
}
