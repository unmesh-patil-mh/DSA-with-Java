/* 
 You are given a boolean maze the obstacle id denoted false you need to find a path
 by avoiding Obstacle
 */

package mazeQuestions;

public class C_ObstacleInMaze {
	static void path(String p , int r ,int c , boolean[][] maze){
		if(r == maze.length - 1 & c == maze[0].length - 1) {
			System.out.println(p);
			return;
		}
		
		// IF OUR ROW AND COLUMN IS FALSE MEANS OBSTACLE PRESENT SO RETURN IT
		if(!maze[r][c]) {
			return;
		}
		
		// Moving Right
		if(c < maze[0].length - 1) {
			path(p + 'R' , r , c + 1,maze);
		}
		
		// Moving Down
		if(r < maze.length - 1) {
			path(p + 'D' , r  + 1 , c,maze);
		} 	
	}
	
	public static void main(String[] args) {
        boolean[][] maze = {
                { true,  true, true  },
                { true,  false,  true },
                { true, true,  true  }
            };
        
        path("" , 0 , 0 , maze);
	}
}
