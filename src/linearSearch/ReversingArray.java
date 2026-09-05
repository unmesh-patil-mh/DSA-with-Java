package linearSearch;

import java.util.Arrays;

public class ReversingArray {
	
	static int[] ReverseArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		
		// CHECKING THE LENGTH OF ARRAY
		if(arr.length == 0 ) {
			return new int[0];
		}
		
		// IF ARRAY LENGTH 1 THEN REVERSE ARRAY WILL BE SAME
		if(arr.length == 1) {
			return arr;
		}
		
		// WHILE CONDITIONS NOT TRUE MEANS REVERSE COMPLETE
		while(start < end) {
			// SWAPPING LAST WITH FIRST AND SO ON....
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int[] result = ReverseArray(arr);
		System.out.println(Arrays.toString(result));
	}
}
