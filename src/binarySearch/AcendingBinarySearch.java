package binarySearch;


public class AcendingBinarySearch {
	static int BinarySearch(int[] arr , int target) {
		
		int start = 0;
		
		int end = arr.length - 1;
		
		while(start <= end) {
			
			int middle = start + (end - start)/2;
			
			if(arr[middle] == target) {
				return middle;
			}
			
			if(arr[middle] < target) {
				start = middle + 1;
			}
			
			if(arr[middle] > target) {
				end = middle - 1;
			}
		}
		
		return -1;
	}
	
	public static void main(String args[]) {
		
		int[] arr = {2,4,6,8,10,12,14,16,20,24};
		
		int target = 8;
		
		int result = BinarySearch(arr, target);
		
		System.out.println("The Target Element Found at Index: " + result);
		
	}
}	
