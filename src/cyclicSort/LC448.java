/*
 Given an array nums of n integers where nums[i] is in the range [1, n],
 return an array of all the integers in the
 range [1, n] that do not appear in nums.
  */

package cyclicSort;

import java.util.ArrayList;
import java.util.List;

public class LC448 {
	static List<Integer> findDisappearedNumbers(int[] arr) {
		int i = 0;
		
		// 1. SORTING
		while(i < arr.length) {
			int correct = arr[i] - 1;
			
			if(i < arr.length && arr[i] != arr[correct]) {
				swap(arr, i , correct);
			}else {
				i++;
			}
		}
		
		// 2. SEARCHING
		ArrayList<Integer> ans = new ArrayList<>();
		for(int j = 0 ; j < arr.length ; j++) {
			if(arr[j] != j + 1) {
				ans.add(j+1);
			}
		}
		
		return ans;
	}
	
	static void swap(int[] arr , int a , int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {4,3,2,7,8,2,3,1};
		
		List<Integer> result = findDisappearedNumbers(arr);
		
		System.out.println(result);
	}
}
