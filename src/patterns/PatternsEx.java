/*
SOURCE:
https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md
 */

package patterns;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;

public class PatternsEx {
	
	static void pattern1(int n) {
		for(int row = 1 ; row <= n ; row++) {
			for(int col = 1 ; col <= n ; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern2(int n) {
		for(int row = 1 ; row <= n ; row++) {
			for(int col = 1 ; col <= row ; col++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern3(int n) {
		for(int row = 1 ; row <= n ; row++) {
			for(int col = 1 ; col <= n + 1 - row ; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern4(int n) {
		for(int row = 1 ; row <= n ; row++) {
			for(int col = 1 ; col <= row ; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
	
	static void pattern5(int n) {
		int maxRow = 2 * n - 1;
		
		for(int row = 1 ; row <= maxRow ; row++) {
			if(row <= n) {
				for(int col = 1 ; col <= row ; col++) {
					System.out.print("* ");
				}
			}else {
				for(int col = 1 ; col <= maxRow - row + 1 ; col++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	
	static void pattern6(int n) {
		for(int row = 1 ; row <= n ; row++) {
			
			for(int space = n - row; space >= 0 ; space--) {
				System.out.print("  ");
			}
			for(int col = 1 ; col <= row ; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern7(int n) {
		for(int row = 1 ; row <= n ; row++) {
			
			for(int space = 1; space <= row - 1 ; space++) {
				System.out.print("  ");
			}
			for(int col = n + 1 - row ; col >= 1 ; col--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern8(int n) {
		for(int row = 1 ; row <= n ; row++) {
			for(int space = n - row ; space >= 0 ; space--) {
				System.out.print(" ");
			}
			for(int col = 1 ; col <= 2*row - 1 ; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern9(int n) {
		for(int row = 1 ; row <= n ; row++) {
			for(int space = 0 ; space < row - 1 ; space++) {
				System.out.print(" ");
			}
			for(int col = 1 ; col <= 2 * n - (row + (row - 1)) ; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern10(int n) {
		for(int row = 1 ; row <= n ; row++) {
			for(int space = 0 ; space <= n - row ; space++) {
				System.out.print(" ");
			}
			for(int col = 1 ; col <= row ; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern11(int n) {
		for(int row = 1 ; row <= n ; row++) {
			for(int space = 1 ; space <= row - 1 ; space++) {
				System.out.print(" ");
			}
			for(int col = n + 1 - row ; col >= 1 ; col--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern12(int n) {
		int maxRow = 2 * n;
		for(int row = 1 ; row <= maxRow ; row++) {
			if(row <= n) {
				for(int space = 1 ; space <= row - 1 ; space++) {
					System.out.print(" ");
				}
				for(int col = n + 1 - row ; col >= 1 ; col--) {
					System.out.print("* ");
				}
			}
			if(row > n){
				for(int space = maxRow - row ; space >= 1 ; space--) {
					System.out.print(" ");
				}
				for(int col = 1 ; col <= row - n ; col++) {
					System.out.print("* ");
				}
			}
			
			
			System.out.println();
		}
	}
	
	static void pattern13(int n) {
		// Outer For Loop
		for(int row = 1 ; row <= n  ; row++) {
			
			if(row == n) {
				for(int col = 1 ; col <= 2 * n - 1  ; col++) {
					System.out.print("*");
				}
			}
			else {
				// For Loop for left Space
				for(int space = n - row ; space >= 1 ; space--) {
					System.out.print(" ");
				}
				if(row > 0) {
					System.out.print("*");
				}
				// For loop for Middle space
				if(row > 1) {
					for(int space = 1 ; space <= 2 * row - 3 ; space++) {
						System.out.print(" ");
					}										
					System.out.print("*");		
				}
			}
			System.out.println();
		}
		
	}
	
	static void pattern14(int n) {
		for(int row = 1 ; row <= n ; row++ ) {
			if(row == 1) {
				for(int col = 1 ; col <= 2 * n - 1 ; col++) {
					System.out.print("*");
				}
			}else {
				// Left side loop
				for(int spaceL = 1  ; spaceL <= row - 1 ; spaceL ++) {
					System.out.print(" ");
				}
				
				System.out.print("*");
				
				// Right side loop
				if(row < n) {
					for(int spaceM = 1 ; spaceM <= 2 * (n - row) - 1 ; spaceM++ ) {
						System.out.print(" ");
					}
					System.out.print("*");
				}	
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int n = 5;
		
		pattern14(n);
	}
}
