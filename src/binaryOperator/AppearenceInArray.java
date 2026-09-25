/*
 Each number in array appears twice just one number appear once 
 find that number which appears one in the array
  */

package binaryOperator;

public class AppearenceInArray {
	public static void main(String[] args) {
		int[] arr = {1,3,5,7,2,2,5,3,7};
		
		System.out.println(Once(arr));
	}
	
	static int Once(int[] arr) {
		int unique = 0;
		
		// a XOR(^) a gives 0 so XOR all elements the elements appearing twice will 
		// become zero and remaining number will be appearing once
		for(int i = 0 ; i < arr.length ; i++) {
			unique ^= arr[i];
		}
		
		return unique;
	}
}
