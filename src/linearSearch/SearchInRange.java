package linearSearch;

public class SearchInRange {
	static int SearchRange(int[] arr , int target , int start , int end) {
		if(arr.length == 0) {
			return -1;
		}
		
		// CHECKING WHETHER START AND END VALUES ARE CORRECT OR NOT
		if(start < 0 || end > arr.length || start > end) {
			System.out.println("Enter the valid value");
			return -1;
		}
		
		for(int index = start ; index <= end ; index++) {
			int element = arr[index];
			if(element == target) {
				return index;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,4,5,6,78,9,10};
		int target = 9;
		int start = 2;
		int end = 5;
		int result = SearchRange(nums, target, start, end);
		System.out.println("Element present at: " + result);
	}
}
