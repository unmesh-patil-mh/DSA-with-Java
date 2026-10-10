/* How many queens can be placed on board without effecting one another*/

package backTrackingQuestions;


public class C_NQueenProblem {
	static int Nqueen(boolean[][] board , int r) {
		if(r == board.length) {
			display(board);
			System.out.println();
			return 1;
		}
		
		int count = 0;
		
		for(int c = 0 ; c < board.length ; c++) {
			if(isSafe(board,r,c)) {
				board[r][c] = true;
				count += Nqueen(board,r+1);
				board[r][c] = false;
			}
		}
		return count;
	}

	private static boolean isSafe(boolean[][] board, int r, int c) {
		
		// check if any other queen present in same vertical row 
		for(int i = 0 ; i < r ; i++) {
			if(board[i][c]) {
				return false;
			}
		}
		
		// Check for left diagonal
		int maxleft = Math.min(r, c);
		for(int i = 0 ; i <= maxleft ; i++) {
			if(board[r - i][c - i]) {
				return false;
			}
		}
		
		// check for Right Diagonal
		int maxRight = Math.min(r, board.length - c - 1);
		for(int i = 0 ; i <= maxRight ; i++) {
			if(board[r-i][c+i]) {
				return false;
			}
		}
		
		return true;
	}

	private static void display(boolean[][] board) {
		for(boolean[] row : board) {
			for(boolean element : row) {
				if(element) {
					System.out.print("Q");
				}else {
					System.out.print("X");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int n = 4;
		
		boolean[][] board = new boolean[n][n];
		Nqueen(board,0);
	}
}
