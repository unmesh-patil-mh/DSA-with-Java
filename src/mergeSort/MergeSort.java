/* In merge sort we divide our array in two parts then sort each part individually
 then merge the two sorted part together and add them into newly created array and 
 this new Array is our sorted array */

// TIME COMPLEXITY - O(n log n)

package mergeSort;

import java.util.Arrays;

public class MergeSort {
	static int[] Sorting(int[] arr) {
		// IF ARRAY LENGTH IS ONE WE WILL RETURN THAT SINGLE ELEMENT
		if(arr.length == 1) {
			return arr;
		}
		
		// DIVIDING OUR ARRAY IN TWO PARTS FROM MID
		int mid = arr.length / 2;
		
		
		// Dividing our Array into two arrays and storing them
		// Copy of range copies our array into specific range
		int[] left = Sorting(Arrays.copyOfRange(arr, 0, mid));
		int[] right = Sorting(Arrays.copyOfRange(arr, mid, arr.length));
		
		// Merge will now merge our both sorted array into one new array
		return Merge(left,right);
	}
	
	static int[] Merge(int[] leftPart , int[] rightPart) {
		// creating new array which we store the array which will be merged
		int[] ans = new int[leftPart.length + rightPart.length];
		
		// Creating the pointer through which we will access our all three arrays
		int i = 0;
		int j = 0;
		int k = 0;
		
		// loop till array become out of bound
		while( i < leftPart.length && j < rightPart.length) {
			// comparing first element of both array and smallest will be issued first
			if(leftPart[i] < rightPart[j]) {
				ans[k] = leftPart[i];
				i++;
			}else {
				ans[k] = rightPart[i];
				j++;
			}
			k++;
		}
		
		// Our One Array can go out of Bound and second still remaining so array which is 
		// not out of bound we will copy that array elements
		
		while(i < leftPart.length) {
			ans[k] = leftPart[i];
			i++;
			k++;
		}
		
		while(j < rightPart.length) {
			ans[k] = rightPart[j];
			j++;
			k++;
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		int[] array = {2,3,1,6,4,8,9};
		
		int[] ans = Sorting(array);
		
		System.out.println(Arrays.toString(ans));
	}
}
