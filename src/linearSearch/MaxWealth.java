package linearSearch;

public class MaxWealth {
	
	static int maxwealth(int[][] arr) {
		
		int wealth = Integer.MIN_VALUE;

		if(arr.length == 0) {
			return -1;
		}
		
		for(int row = 0 ; row < arr.length ; row++) {
			int amount = 0;
			for(int col = 0 ; col < arr[row].length ; col++) {
				amount += arr[row][col];
			}
			if(amount > wealth) {
				wealth = amount;
			}
		}
		
		
		return wealth;
	}
	
	public static void main(String[] args) {
		int[][] nums = {
				{10,20,30},
				{2,5,10},
				{50,40,30},
				{25,43,83}
		};
		
		int result = maxwealth(nums);
		
		System.out.println(result);
	}
}
