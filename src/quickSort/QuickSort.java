package quickSort;

import java.util.Arrays;

public class QuickSort {
	static void sorting(int[] arr , int low , int high) {
		if(low >= high) {
			return;
		}
		
		// SETTING LOCAL VARIABLES TO ITERATE
		int s = low;
		int e = high;
		
		int mid = s + (e-s)/2;
		
		// taking element at mid as a pivot
		int Pivot = arr[mid];
		
		while(s <= e) {
			// if left side element is less than pivot keep it as it is
			while(arr[s] < Pivot) {
				s++;
			}
			
			// if Right hand side is greater than pivot keep it as it is
			while(arr[e] > Pivot) {
				e--;
			}
			
			// to avoid the shuffling if already reversed so again condition
			if(s <= e) {
				int temp = arr[s];
				arr[s] = arr[e];
				arr[e] = temp;
				s++;
				e--;
			}
		}
		
		// Now Doing same for two separate divided array we have
		
		// As at the end of while loop our start will go after end so divide array accordingly
		sorting(arr,low,e); // Left Part 
		sorting(arr,s,high); // Right Part
	}
	
	public static void main(String[] args) {
		int[] array = {2,3,1,6,5,4,8,9}; 
		
		sorting(array,0,array.length - 1);
		
		System.out.println(Arrays.toString(array));
	}
}
