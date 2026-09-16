
// USED WHEN WE NEED TO SORT THE NUMBER IN RANGER -> 1 TO N / 0 TO N
// TO FIND THE MISSING NUMBER


package cyclicSort;

import java.util.Arrays;

public class CyclicSort {
	static void cyclic(int[] arr) {
		int i = 0;
		// ITERATE TO END OF OUR ARRAY
		while(i < arr.length) {
			int correct = arr[i] - 1; // for range 1 to n
			// int correct = arr[i]; // for range 0 to n
			
			
			// If element not at correct position swap it with correct position
			if(arr[i] != arr[correct]) {
				swap(arr,i,correct);
			}else {
				i++;
			}
		}
	}
	
	static void swap(int[] arr , int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,4,5,3,2};
		
		cyclic(arr);
		
		System.out.println(Arrays.toString(arr));
	}
}
