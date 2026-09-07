// You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
//Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

package binarySearch;

public class LC744 {
	static char nextGreatestLetter(char[] arr , char target) {
		
		int start = 0;
		
		int n = arr.length;
		
		int end = n -1;
		
		while(start <= end) {
			
			int mid = start + (end - start)/2;
			
//			if(arr[mid] == target) {
//				return arr[(mid + 1) % n];
//			}
			
			if(arr[mid] <= target) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
			return arr[start % n];
	}
	
	public static void main(String[] args) {
		char[] arr = {'e' , 'e' , 'g' , 'g'};
		
		char target = 'g';
		
		char result = nextGreatestLetter(arr,target);
		
		System.out.println(result);
	}
}
