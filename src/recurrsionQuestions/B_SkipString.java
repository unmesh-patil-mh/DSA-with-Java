package recurrsionQuestions;

public class B_SkipString {
	static String skipString(String up , String skip) {
		int n = skip.length();
		
		if(up.isEmpty()) {
			return "";
		}
		
		if(up.startsWith(skip)) {
			return skipString(up.substring(n) , skip);
		}else {
			return up.charAt(0) + skipString(up.substring(1) , skip);
		}
	}
	
	public static void main(String[] args) {
		String str = "abdcapplebcda";
		
		String skip = "apple";
		
		System.out.println(skipString(str, skip));
	}
}
