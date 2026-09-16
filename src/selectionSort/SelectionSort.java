package selectionSort;

import java.util.Arrays;

public class SelectionSort {
	static void selection(int[] arr) {
		// USING I TO ITERATE THROUGH ALL THE ELEMENTS
		for(int i = 0; i < arr.length ; i++) {
			/* last index means till which element our array is not sorted as largest
			element will be at last after each iteration */
			int last = arr.length - 1 - i;
			
			int maxIndex = greatestElement( arr , 0 , last);
			
			swap(arr,maxIndex,last);
		}
	}
	
	static void swap(int[] arr , int a , int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	static int greatestElement(int[] arr , int start , int end) {
		int max = start;
		
		for(int i = start ; i <= end ; i++) {
			if(arr[max] < arr[i]) {
				max = i;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] arr = {20,10,50,30,40,70};
		
		selection(arr);
		
		System.out.println(Arrays.toString(arr));
	}
}
