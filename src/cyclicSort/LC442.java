/*
 Given an integer array nums of length n where all the integers of nums are
 in the range [1, n] and each integer appears at most twice, return an array of all
 the integers that appears twice.

 You must write an algorithm that runs in O(n) time and uses only constant auxiliary
 space, excluding the space needed to store the output
 */

package cyclicSort;

import java.util.ArrayList;
import java.util.List;

public class LC442 {
	static List<Integer> findDuplicates(int[] arr){
		int i = 0;
		
		// 1. Cyclic Sorting
		while(i < arr.length) {
			int correct = arr[i] - 1;
			
			if(arr[i] != arr[correct]) {
				swap(arr,i,correct);
			}else {
				i++;
			}
		}
		
		// 2. SEARCHING
		List<Integer> result = new ArrayList<>();
		for(int j = 0 ; j < arr.length ; j++) {
			if(arr[j] != j + 1) {
				result.add(arr[j]);
			}
		}
		
		return result;
	}
	
	static void swap(int[] arr , int a , int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {4,3,2,7,8,2,3,1};
		
		List<Integer> result = findDuplicates(arr);
		
		System.out.println(result);
	}
}
