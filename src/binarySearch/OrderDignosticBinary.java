package binarySearch;

public class OrderDignosticBinary {
	static int OrderDignosticBinary(int[] arr , int target) {
		
		int start = 0;
		
		int end = arr.length - 1; 
		
		boolean isAsc = arr[start] < arr[end];
		
		while(start <= end) {
			
			int mid = start + (end - start)/2;
			
			if(arr[mid] == target) {
				return mid;
			}
			
			if(arr[mid] < target) {
				if(isAsc) {
					start = start + 1;
				}else {
					end = end - 1;
				}
			}
			
			if(arr[mid] > target) {
				if(isAsc) {
					end = mid - 1;
				}else {
					start = mid + 1;
				}
			}
			
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {24,22,20,18,16,14,12,10,8,6,4,2,0};
		
		int target = 16;
		
		int[] arr1 = {0,2,4,6,8,10,12,14,16,18,20,22,24};
		
		int result1 = OrderDignosticBinary(arr, target);
		
		int result2 = OrderDignosticBinary(arr1, target);
		
		System.out.println("Acending Order Index is: " + result2);
		
		System.out.println("Decending Order Index is: " + result1);
		
	}
}
