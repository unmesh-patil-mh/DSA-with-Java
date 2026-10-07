package recurrsionQuestions;

public class G_RollADie {
	static void dice(String p , int target) {
		if(target == 0) {
			System.out.println(p);
			return;
		}
		
		for(int i = 1 ; i <= 6 && i <= target ; i++ ) {
			dice(p + i , target - i);
		}
	}
	
	public static void main(String[] args) {
		String str = "";
		
		int target = 3;
		
		dice(str,target);
	}
}
