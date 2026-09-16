/*
 Given an unsorted integer array nums. Return the smallest positive integer that
 is not present in nums.

 You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space. 
 */

package cyclicSort;

public class LC41 {
	static int firstMissingPositive(int[] arr) {
		// 1. CYCLIC SORTING
		int i = 0;
		while(i < arr.length) {
			
			if(arr[i] > 0 && arr[i] < arr.length) {
				int correct = arr[i] - 1;
				
				if(arr[i] != arr[correct]) {
					swap(arr,i,correct);					
				}else {
					i++;
				}
			}else {
				i++;
			}
		}
		
		
		// 2. SEARCHING FOR FIRST MISSING POSITIVE
		for(int j = 0 ; j < arr.length ; j++) {
			if(arr[j] != j+1) {
				return j + 1;
			}
		}
		
		return arr.length + 1;
	}
	
	static void swap(int[] arr, int a , int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,0};
		
		int result = firstMissingPositive(arr);
		
		System.out.println(result);
	}
}
