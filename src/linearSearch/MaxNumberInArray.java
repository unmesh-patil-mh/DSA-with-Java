package linearSearch;

public class MaxNumberInArray {
	
	static int MaxNumber(int[] arr) {
		int max = Integer.MIN_VALUE;
		
		if(arr.length == 0) {
			return -1;
		}
		
		for(int index = 0 ; index < arr.length ; index++) {
			int element = arr[index];
			if(element > max) {
				max = element;
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		int[] nums = {21,3,45,64,12,52,69};
		int result = MaxNumber(nums);
		System.out.println(result);
	}
}
