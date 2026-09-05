package linearSearch;



public class SearchInString {
	
	static int Search(String str , char target) {
		// CHECKING IF STRING LENGTH IS NOT ZERO
		if(str.length() == 0) {
			return -1;
		}
		
		// LOOPING THROUGH ALL ELEMENTS OF OUR STRING
		for(int index = 0 ; index < str.length() ; index++) {
			int element = str.charAt(index);
			if(element == target) {
				return index;
			}
		}
		
		// IF ELEMENT NOT FOUND RETURN -1
		return -1;
	}
	
	public static void main(String[] args) {
		String str = "Unmesh";
		char target = 'e';
		int result = Search(str, target);
		System.out.println(result);
	}
}
