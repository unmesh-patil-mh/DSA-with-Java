package backTrackingQuestions;

public class D_NKnightProblem {
	static void Knight(boolean[][] board,int r, int c,int Knight) {
	    if(Knight == 0) {
	        display(board);
	        System.out.println();
	        return;
	    }

	    if(r == board.length) {
	        return;
	    }
		
		if(c == board.length ) {
			Knight(board,r+1,0,Knight);
			return;
		}
		
		// If Safe Place Knight
		if(isSafe(board,r,c)) {
			board[r][c] = true;
			Knight(board,r,c+1,Knight-1);
			board[r][c] = false;
		}
		
		// If not safe move to the next column
		Knight(board,r,c+1,Knight);
	}
	
	private static boolean isSafe(boolean[][] board, int r, int c) {
		if(isValid(board,r-2,c-1)) {
			if(board[r-2][c-1]) {
				return false;
			}
		}
		
		if(isValid(board,r-2,c+1)) {
			if(board[r-2][c+1]) {
				return false;
			}
		}
		
		if(isValid(board,r-1,c+2)) {
			if(board[r-1][c+2]) {
				return false;
			}
		}
		
		if(isValid(board,r+1,c+2)) {
			if(board[r+1][c+2]) {
				return false;
			}
		}
		
		return true;
	}

	private static boolean isValid(boolean[][] board, int r, int c) {
		if(r >= 0 && r < board.length && c >= 0 && c < board.length) {
			return true;
		}
		
		return false;
	}

	private static void display(boolean[][] board) {
		for(boolean[] row : board) {
			for(boolean element : row) {
				if(element) {
					System.out.print("K");
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
		Knight(board,0,0,4);
	}
	
}
