package binarySearch;

public class CountOfTimesArrayRotated {
	static int rotatedCount(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(mid < end && arr[mid] > arr[mid + 1]) {
				return mid + 1;
			}
			
			if(mid > start && arr[mid - 1] > arr[mid]) {
				return mid;
			}
			
			if(arr[mid] <= arr[start]) {
				end = mid - 1;
			}else {
				start = mid + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {7,8,9,10,11,12,3,4,5,6};
		
		int result = rotatedCount(arr);
		
		System.out.println(result);
	}
}
