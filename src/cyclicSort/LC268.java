/*
  Given an array nums containing n distinct numbers in the range [0, n], return
  the only number in the range that is missing from the array.
 * */

package cyclicSort;

public class LC268 {
	// To first it we will first sort the Array then iterate and find the number which is missing
	static int missingNumber(int[] arr) {
	
		int i = 0;
		
		// 1. Sorting
		while(i < arr.length) {
			int correct = arr[i]; // range is 0 to n
			
			if(arr[i] < arr.length && arr[i] != arr[correct]) {
				swap(arr , i , correct);
			}else {
				i++;
			}
		}
		
		// 2. Searching
		for(int j = 0 ; j < arr.length ; j++) {
			if(arr[j] != j) {
				return j;
			}
		}
		
		return arr.length;
		
	}
	
	static void swap(int[] arr , int a , int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {9,6,4,2,3,5,7,0,1};
		
		int result = missingNumber(arr);
		
		System.out.println(result);
	}
}
