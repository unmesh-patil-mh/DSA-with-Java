package linearSearch;

public class ElementContainsEvenNoOfDigits {
	
	static int EvenNumberCount(int[] arr) {
		
		if(arr.length == 0) {
			return 0;
		}
		
		int count = 0 ;
		for(int i = 0 ; i < arr.length ; i++) {
			if(isEven(arr[i])) {
				count++;
			}
		}
		
		return count;
	}
	
	static boolean isEven(int val) {
		int NumberOfDigits = Digits(val);
		
		if(NumberOfDigits % 2 == 0) {
			return true;
		}
		
		return false;
		
	}
	
	static int Digits(int val) {
		int count = 0;
		while (val > 0) {
			count++;
			val /= 10;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		int[] nums = {10,30,333,1043,11,3000,24010};
		int result = EvenNumberCount(nums);
		
		System.out.println(result);
	}
	
}
