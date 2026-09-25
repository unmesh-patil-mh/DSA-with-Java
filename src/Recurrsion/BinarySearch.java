package Recurrsion;

public class BinarySearch {
	static int Binary(int[] arr , int target , int s , int e) {
		if(s > e) {
			return -1; // ELEMENT NOT FOUND
		}
		
		int m = s + (e - s)/2;
		
		if(arr[m] == target) {
			return m;
		}
		
		if(arr[m] < target) {
			return Binary(arr ,target ,m + 1 , e);
		}
		
		
		return Binary(arr,target,s,m-1);
	}
	
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10,12,14,16,18};
		
		int target = 16;
		
		int ans = Binary(arr,target,0,arr.length - 1 );
		
		System.out.println(ans);
	}
}
