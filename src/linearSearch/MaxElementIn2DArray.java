package linearSearch;

public class MaxElementIn2DArray {
	
	static int MaxElement(int[][] arr) {
		int max = Integer.MIN_VALUE;
		
		if(arr.length == 0) {
			return -1;
		}
		
		for(int[] elements : arr) {
			for(int element : elements) {
				if(element > max) {
					max = element;
				}
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		int[][] nums= {
				{1,2,3,48},
				{10,20,30,40},
				{5,6,7,83,9},
				{20,21,22}
		};
		
		int result = MaxElement(nums);
		
		System.out.println(result);
	}
	
}
