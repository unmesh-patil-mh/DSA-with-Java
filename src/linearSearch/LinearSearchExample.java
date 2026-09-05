package linearSearch;

// TIME COMPLEXITY : BEST CASE -> O(1)
//					 WORST CASE -> O(n)
public class LinearSearchExample {
	
	static int LinearSearch(int[] arr , int target) {
		
		// IF NO ELEMENTS IN ARRAY RETURN -1
		if(arr.length == 0 ) {
			return -1;
		}
		
		// CHECKING EVERY ELEMENT IN ARRAY TO FIND THE TARGET VALUE
		for(int index = 0 ; index < arr.length ; index++) {
			int element = arr[index];
			if(element == target) {
				return index;
			}
		}
		
		// IF NO SUCH ELEMENT AS TARGET ELEMENT RETURN -1
		return -1;
	}
	
	public static void main(String args[]) {
		int[] nums = {12,43,21,8,35,76,88,45,32,54};
		int target = 45;
		int result = LinearSearch(nums, target);
		
		System.out.println("Index where our Element is found is : " + result);
	}
}
