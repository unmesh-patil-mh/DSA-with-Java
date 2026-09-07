// FLOOR - Greatest Number Smaller or equal to the target opposite of celling
// Same logic after termination of while loop {end target start} so return end

package binarySearch;

public class FloorInArray {
	static int floor(int[] arr , int target) {
		
		int start = 0;
		
		int end = arr.length - 1;
		
		while(start <= end) {
			
			int mid = start + (end - start)/2;
			
			if(arr[mid] == target) {
				return arr[mid];
			}
			
			if(arr[mid] < target) {
				start = start + 1;
			}
			
			if(arr[mid] > target) {
				end = end - 1;
			}
		}
		
		return arr[end];
	}
	
	public static void main(String args[]) {
		
		int[] arr = {2,4,6,8,10,12,14,16,20,24};
		
		int target = 19;
		
		int result = floor(arr, target);
		
		System.out.println("The Floor Element in Array is: " + result);
		
	}
}
