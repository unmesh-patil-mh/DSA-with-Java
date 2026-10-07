package recurrsionQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D_SubsetUsingLoops {
	static List<List<Integer>> subset(int[] arr){
		// Defining our outer List
		List<List<Integer>> outer = new ArrayList<>();
		
		// Adding one Empty List First
		outer.add(new ArrayList<>());
		
		for(int num : arr) {
			int n = outer.size();
			
			for(int i = 0 ; i < n ; i++) {
				List<Integer> internal = new ArrayList<>(outer.get(i));
				internal.add(num);
				outer.add(internal);
			}
		}
		return outer;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		
		List<List<Integer>> ans = subset(arr);
		
		
		for(List<Integer> list : ans) {
			System.out.println(list);
		}
	}
}
