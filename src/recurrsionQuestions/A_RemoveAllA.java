package recurrsionQuestions;

public class A_RemoveAllA {
	
	// FIRST METHOD
	static void skip1(String p , String up) {
		
		p.toLowerCase();
		
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch = up.charAt(0);
		
		if(ch == 'a') {
			// IF CHAR IS A WE WILL SKIP THAT CHARCTER AND MOVE ON TO NEXT CHAR
			skip1(p,up.substring(1)); 
		}else {
			// ELSE WE WILL ADD THE CHAR IN P AND MOVE ON TO NEXT STRING
			skip1(p + ch , up.substring(1));			
		}
	}
	
	
	// SECOND METHOD
	static String skip2(String p , String up) {
		
		up.toLowerCase();
		
		if(up.isEmpty()) {
			return p;
		}
		
		char ch = up.charAt(0);
		
		if(ch == 'a') {
			return skip2(p , up.substring(1));
		}else {
			return skip2(p + ch , up.substring(1));
		}
	}
	
	public static void main(String[] args) {
		String str = "aabdeadc";
		
		String p = "";
		
		skip1(p,str);
		
		System.out.println(skip2(p,str));
		
	}
}
