/* 
 In the maze target can only go right and down print how many ways the man can reach its
 target
 */

package mazeQuestions;

public class A_ManyWays {
	static int countways(int r , int c) {
		if(r == 1 || c == 1) {
			return 1;
		}
		
		// Moving Right
		int right = countways(r , c - 1);
		// Moving left
		int left = countways(r - 1 , c);
		
		return left + right;
	}
	
	public static void main(String[] args) {
		System.out.println(countways(3,3));
	}
}
