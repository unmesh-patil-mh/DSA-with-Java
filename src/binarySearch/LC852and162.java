//You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
//
//Return the index of the peak element.
//
//Your task is to solve it in O(log(n)) time complexity.

package binarySearch;

public class LC852and162 {
	static int PeakElement(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start < end) { // it will break when start == end so we return start or end
			
			int mid = start + (end - start)/2;
			
			if(arr[mid] < arr[mid+1]) { // Increasing Order
				start = mid + 1;
			}else {
				end = mid;
			}
		}
		return start; // as start = end we can return end; also
	}
	
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10,12,14,13,11,10,9,3}; 
		
		
		int result = PeakElement(arr);
		
		System.out.println(result);
	}
}
