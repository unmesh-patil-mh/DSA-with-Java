package linearSearch;

import java.util.Arrays;

public class SearchingIn2DArray {

	static int[] Search(int[][] arr , int target) {
		if(arr.length == 0) {
			return new int[0];
		}
		
		for(int row = 0 ; row < arr.length ; row++) {
			for(int col = 0 ; col < arr[row].length ; col++) {
				if(arr[row][col] == target) {
					return new int[]{row , col};
				}
			}
		}
		return new int[0];
	}
	
	public static void main(String[] args) {
		int[][] nums= {
				{1,2,3,4},
				{10,20,30,40},
				{5,6,7,8,9},
				{20,21,22}
		};
		
		int target = 9;
		
		int[] result = Search(nums,target);
		
		System.out.println(Arrays.toString(result));
	}
}
