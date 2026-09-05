package linearSearch;


public class MinNumberInArray {
	
	static int MinNumber(int[] arr) {
		int min = Integer.MAX_VALUE;
		
		if(arr.length == 0) {
			return Integer.MIN_VALUE;
		}
		
		for(int elements : arr) {
			if(elements < min) {
				min = elements;
			}
		}
		return min;
	} 
	
	public static void main(String[] args) {
		int[] nums = {21,32,441,56,25,20,445,7};
		int result = MinNumber(nums);
		System.out.println(result);
	}
	
}
