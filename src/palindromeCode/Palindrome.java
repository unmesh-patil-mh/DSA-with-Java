package palindromeCode;

public class Palindrome {
	static boolean isPali(String str) {
		
		str = str.toLowerCase();
		int start = 0;
		
		int end = str.length() - 1;
		
		if(end == 0) {
			return true;
		}
		
		while(start < end) {
			if(str.charAt(start) == str.charAt(end)) {
				start++;
				end--;
			}else{
				return false;
			}
		}
		
		return true;
	}
	
    public static void main(String[] args) {

        String[] testCases = {
            "a",
            "aa",
            "aba",
            "abba",
            "abc",
            "racecar",
            "hello",
            "madam",
            "abccba",
            "abcdba",
            "Aba",
            "Java",
            "",
            "aaabaaa",
            "aabb"
        };

        for(String str : testCases) {
            System.out.println("Input: \"" + str + "\"  Output: " + isPali(str));
        }
    }
}
