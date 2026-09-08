package binarySearch;

public class SearchIn2DMatrix {
	static int[] elementInMatrix(int[][] matrix , int target) {
		int row = 0;
		int column = matrix.length - 1;
		
		while(row < matrix.length && column >= 0 ) {
			if(matrix[row][column] == target) {
				return new int[] {row,column};
			}
			
			if(matrix[row][column] > target) {
				column--;
			}
			
			if(matrix[row][column] < target) {
				row++;
			}
		}
		
		return new int[] {-1,-1};
	}
	
	public static void main(String[] args) {
        int[][] matrix = {
                {1,  4,  7, 11},
                {2,  5,  8, 12},
                {3,  6,  9, 16},
                {10, 13, 14, 17}
            };

        int target = 10;
        
        int[] result = elementInMatrix(matrix, target);
        
        System.out.println("[" + result[0] + "," + result[1] + "]");
	}
}
