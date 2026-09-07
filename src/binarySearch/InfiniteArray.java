package binarySearch;

public class InfiniteArray {
// Infinite array means we cannot use the function of arr.length 
// we will increase the size of array by double and try to find element in it 
	
	static int binarySearch(int[] arr , int target , int start , int end) {
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(arr[mid] == target) {
				return mid;
			}
			
			if(arr[mid] < target) {
				start = mid + 1;
			}
			
			if(arr[mid] > target) {
				end = mid - 1;
			}
		}
		
		return -1;
	}
	
	static int Doubling(int[] arr , int target) {
		int start = 0;
		int end = 1;
		
		while(target > arr[end]) {
			int newstart = end + 1;
			end = end + (end - start)*2;
			start = newstart;
		}
		
		return binarySearch(arr,target,start,end);
	}
	
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10,12,14,16,18,20,22,24}; 
		
		int target = 22;
		
		int result = Doubling(arr,target);
		
		System.out.println(result);
	}
}
