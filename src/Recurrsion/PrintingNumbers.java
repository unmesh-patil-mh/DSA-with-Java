package Recurrsion;

public class PrintingNumbers {
	 static void Printtilln(int n) {
		 // FROM N TO 1
		 if(n == 0 ) {
			 return;
		 }
		 
		 System.out.print(n + " ");
		 Printtilln(n-1);
	 }
	 
	 static void Printfromn(int n) {
		 // FROM 1 TO N
		 if(n == 0) {
			 return;
		 }
		 
		 Printfromn(n - 1);
		 System.out.print(n + " ");
	 }
	 
	 public static void main(String[] args) {
		Printtilln(5);
		System.out.println();
		Printfromn(5);
	}
}
