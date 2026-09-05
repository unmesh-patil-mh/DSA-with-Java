package binarySearch;

// CELLING = Smallest Element in Array which is smallest element that is greater or Equal to array
// Instead of returning -1 we will return arr[start] as at while loop end we have {end target start} if loop is voilated
public class CellingInArray {
	static int CellingElement(int[] arr , int target) {
		
		int start = 0;
		
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(arr[mid] == target) {
				return arr[mid];
			}
			
			if(arr[mid] < target) {
				start = mid + 1;
			}
			
			if(arr[mid] > target) {
				end = mid - 1; 
			}
		}
		
		return arr[start];
	}
	
	public static void main(String args[]) {
		
		int[] arr = {2,4,6,8,10,12,14,16,20,24};
		
		int target = 13;
		
		int result = CellingElement(arr, target);
		
		System.out.println("The Celling Element in Array is: " + result);
		
	}
}
