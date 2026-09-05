package binarySearch;


public class DescendingBinarySearch {
	static int binarySearch(int[] arr, int target) {
		
		int start = 0;
		
		int end = arr.length - 1;
		
		while(start <= end) {
			
			int mid = start + (end - start)/2;
			
			if(arr[mid] == target) {
				return mid;
			}
			
			if(arr[mid] > target) {
				start = mid + 1;
			}
			
			if(arr[mid] < target) {
				end = mid - 1;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {24,22,20,18,16,14,12,10,8,6,4,2,0};
		
		int target = 21;
		
		int result = binarySearch(arr,target);
		
		System.out.println(result);
	}
}
