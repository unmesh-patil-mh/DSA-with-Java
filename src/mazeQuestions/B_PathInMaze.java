package mazeQuestions;

import java.util.ArrayList;

public class B_PathInMaze {
	static void path(String p , int r , int c) {
		if(r == 1 & c == 1) {
			System.out.println(p);
			return;
		}
		
		// Moving Right
		if(c > 1) {
			path(p + 'R' , r , c - 1);
		}
		
		// Moving Down
		if(r > 1) {
			path(p + 'D' , r - 1 , c);
		}
	}
	
	// PRINTING PATH IN LIST FORMAT
	static ArrayList<String> pathList(String p ,int r , int c){
		if(r == 1 & c == 1) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		
		ArrayList<String> ans = new ArrayList<>();
		
		// Moving Right
		if(c > 1) {
			ans.addAll(pathList(p + 'R' , r , c - 1));
		}
		
		// Moving Down
		if(r > 1) {
			ans.addAll(pathList(p + 'D' , r - 1 , c));
		}
		
		return ans;
	}
	
	// PATH BUT DIAGONAL INCLUDED
	static ArrayList<String> pathdig(String p , int r , int c){
		if(r == 1 & c == 1) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		
		ArrayList<String> ans = new ArrayList<>();
		
		// Moving Right
		if(c > 1) {
			ans.addAll(pathdig(p + 'R' , r , c -1));
		}
		
		// Moving Diagonal
		if(c > 1 & r > 1) {
			ans.addAll(pathdig(p + 'K' , r - 1 , c - 1));
		}
		
		// Moving Down
		if(r > 1) {
			ans.addAll(pathdig(p + 'D' , r - 1 , c));
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		path("" , 3 , 3);
		
		System.out.println(pathList("",3,3));
		
		System.out.println(pathdig("",3,3));
	}
}
