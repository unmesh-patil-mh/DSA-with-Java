package recursionArrays;

import java.util.Arrays;

public class Bubble {
	static void sort(int[] arr,int end,int index) {
		if(end == 0) {
			return;
		}
		
		if(index < end) {
			if(arr[index] >arr[index+1]) { // ascending order
				// SWAPPING
				int temp = arr[index];
				arr[index] = arr[index + 1];
				arr[index + 1] = temp;
			}
			sort(arr,end,index+1); // continue this phase
		}else {
				sort(arr,end-1,0);// next pass
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {2,3,1,8,9,5,6,7};
		
		sort(arr,arr.length - 1 , 0);
		
		System.out.println(Arrays.toString(arr));
	}
}
