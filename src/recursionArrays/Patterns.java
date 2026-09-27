package recursionArrays;

public class Patterns {
	static void traingle(int row , int col) {
		if(row == 0) {
			return;
		}
		
		if(col < row) {
			System.out.print("* ");
			traingle(row , col + 1);
		}else {
			System.out.println();
			traingle(row - 1 , 0);
		}
	}
	
	public static void main(String[] args) {
		traingle(4,0);
	}
}
