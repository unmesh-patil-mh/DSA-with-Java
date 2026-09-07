// LC 1095
//(This problem is an interactive problem.)
//
//You may recall that an array arr is a mountain array if and only if:
//
//arr.length >= 3
//There exists some i with 0 < i < arr.length - 1 such that:
//arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
//arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
//Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.
//
//You cannot access the mountain array directly. You may only access the array using a MountainArray interface:
//
//MountainArray.get(k) returns the element of the array at index k (0-indexed).
//MountainArray.length() returns the length of the array.
//Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any solutions that attempt to circumvent the judge will result in disqualification.

package binarySearch;

public class SearchInMountainArray {
	
	static int Peak(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start < end) {
			
			int mid = start + (end-start)/2;
			if(arr[mid] < arr[mid+1]) { // Increasing Order
				start = mid + 1;
			}else { // Decreasing Order
				end = mid;
			}
		}
		
		return start;	
	}
	
	static int OrdinalSearch(int[] arr , int target , int start , int end) {
		
		boolean isAsc = arr[start] < arr[end];
		
		while(start <= end) {
			
			int mid = start + (end - start)/2;
			
			if(arr[mid] == target) {
				return mid;
			}
			
			if(arr[mid] < target) {
				if(isAsc) {
					start = mid + 1;
				}else {
					end = mid - 1;
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
	
	
	static int findInMountainArray(int[] arr , int target) {
		
		int peak = Peak(arr);
		
		int resultAsc = OrdinalSearch(arr, target, 0, peak);
		
		if(resultAsc != -1) {
			return resultAsc;
		}else {
			return OrdinalSearch(arr, target, peak, arr.length-1);
		}
		
	}
	
	
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10,12,14,15,11,10,9,3}; 
		
		
		int result = findInMountainArray(arr , 6);
		
		System.out.println(result);
	}
}


// LEETCODE CODE
/*
	class Solution {

    public int Peak(MountainArray arr) {

        int start = 0;
        int end = arr.length() - 1;

        while(start < end) {

            int mid = start + (end - start) / 2;

            int midValue = arr.get(mid);
            int nextValue = arr.get(mid + 1);

            if(midValue < nextValue) {
                // Increasing
                start = mid + 1;
            } 
            else {
                // Decreasing
                end = mid;
            }
        }

        return start;
    }


    public int OrdinalSearch(
        MountainArray arr,
        int target,
        int start,
        int end,
        boolean isAsc) {

        while(start <= end) {

            int mid = start + (end - start) / 2;

            // Only ONE get() call
            int value = arr.get(mid);

            if(value == target) {
                return mid;
            }

            if(value < target) {

                if(isAsc) {
                    start = mid + 1;
                } 
                else {
                    end = mid - 1;
                }

            } 
            else {

                if(isAsc) {
                    end = mid - 1;
                } 
                else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }


    public int findInMountainArray(int target, MountainArray mountainArr) {

        // Step 1: Find peak
        int peak = Peak(mountainArr);

        // Step 2: Search ascending part
        int result = OrdinalSearch(
            mountainArr,
            target,
            0,
            peak,
            true
        );

        if(result != -1) {
            return result;
        }

        // Step 3: Search descending part
        return OrdinalSearch(
            mountainArr,
            target,
            peak + 1,
            mountainArr.length() - 1,
            false
        );
    }
}
 */

