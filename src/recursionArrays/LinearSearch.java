package recursionArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinearSearch {
	static int Linear(int[] arr , int target ,int index) {
		if(index == arr.length) {
			return -1;
		}
		
		if(arr[index] == target) {
			return index;
		}
		
		return Linear(arr,target,index+1);
	}
	
	
	
	static List<Integer> ans = new ArrayList<>();
	static List<Integer> SearchAll(int[] arr , int target , int index , List<Integer> ans){
		
		if(index == arr.length) {
			return ans;
		}
		
		if(arr[index] == target) {
			ans.add(index);
		}
		
		return SearchAll(arr,target,index+1,ans);
	}
	
	public static void main(String[] args) {
		int[] arr = {10,9,3,6,3,1,3,11};
		
		int target = 3;
		
		System.out.println(Linear(arr,target,0));
		
		SearchAll(arr,3,0,ans);
		
		System.out.println(ans);
	}
}
