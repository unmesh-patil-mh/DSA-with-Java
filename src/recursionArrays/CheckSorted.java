package recursionArrays;

public class CheckSorted {
	static boolean Sorted(int[] arr , int index) {
		if(index == arr.length -1) {
			return true;
		}
		
		return arr[index] < arr[index + 1] && Sorted(arr,index + 1);
	}
	
	public static void main(String[] args) {
		 int[] arr = {2,4,6,8,10,16,14};
		 
		 System.out.println(Sorted(arr , 0));
	}
}
