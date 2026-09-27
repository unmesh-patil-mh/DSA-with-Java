package mergeSort;

import java.util.Arrays;

public class InPlaceMergeSort {
	static void Sorting(int[] arr , int s , int e) {
		if(e - s == 1) {
			return;
		}
		
		int mid = s + (e - s)/2;
		
		Sorting(arr, s , mid);
		Sorting(arr, mid , e);
		
		merge(arr,s,mid,e);
	}
	
	static void merge(int[] arr, int s , int m , int e) {
		int[] ans = new int[e - s];
		
		int i = s;
		int j = m;
		int k = 0;
		
		while(i < m && j < e) {
			if(arr[i] < arr[j]) {
				ans[k] = arr[i];
				i++;
			}else {
				ans[k] = arr[j];
				j++;
			}
			k++;
		}
		
		while(i < m) {
			ans[k] = arr[i];
			i++;
			k++;
		}
		
		while(j < e) {
			ans[k] = arr[j];
			j++;
			k++;
		}
		
		for(int l = 0 ; l < ans.length ; l++) {
			arr[s+l] = ans[l];
		}
	}
	
	public static void main(String[] args) {
		int[] array = {2,3,1,6,5,4,8,9};
		
		Sorting(array,0,array.length);
		
		System.out.println(Arrays.toString(array));
	}
}
