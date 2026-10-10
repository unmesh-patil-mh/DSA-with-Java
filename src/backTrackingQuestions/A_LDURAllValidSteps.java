package backTrackingQuestions;

public class A_LDURAllValidSteps {
	static void allvalid(String p , int r , int c , boolean[][] maze) {
		if(r == maze.length - 1 & c == maze[0].length - 1) {
			System.out.println(p);
			return;
		}
		
		// If there is obstacle in our maze we will return our value
		if(!maze[r][c]) {
			return;
		}
		
		// When we visit one node we will make it false so that we will not go again on
		// that node we will skip it
		maze[r][c] = false;
		
		// Moving up
		if(r > 0) {
			allvalid(p + 'U' , r - 1 , c , maze);
		}
		
		// Moving Down
		if(r < maze.length - 1) {
			allvalid(p + 'D' , r + 1 , c , maze);
		}
		
		// Moving Right
		if(c < maze[0].length - 1) {
			allvalid(p + 'R' , r , c + 1 , maze);
		}
		
		// Moving Left
		if(c > 0) {
			allvalid(p + 'L' , r , c - 1 , maze);
		}
	}
	
	public static void main(String[] args) {
        boolean[][] maze = {
                { true,  true, true  },
                { true,  false,  true },
                { true, true,  true  }
            };
        
        allvalid("",0,0,maze);
	}
}
