//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//
//If target is not found in the array, return [-1, -1].
//
//You must write an algorithm with O(log n) runtime complexity. means binary search here

package binarySearch;

public class LC34 {
	
	static int[] searchRange(int[] arr , int target) {
		int[] ans = {-1,-1};
		
		int a = SearchIndex(arr,target,true);
		int b = SearchIndex(arr,target,false);
		
		ans[0] = a;
		ans[1] = b;
		
		return ans;
	}
	
	static int SearchIndex(int[] arr , int target , boolean isStart) {
		int ans = -1;
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(arr[mid] < target) {
				start = mid + 1;
			}else if(arr[mid] > target) {
				end = mid - 1;
			}else {
				ans = mid;
				
				if(isStart) {
					end = mid - 1; // To find lowest index of element
				}else {
					start = mid + 1; // To find higest index of element 
				}
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		int []arr = {5,7,7,8,8,10};
		int target = 6;
		
		int [] ans = searchRange(arr , target);
		
		System.out.println("[" + ans[0] + "," + ans[1] + "]");
		
	}
}
