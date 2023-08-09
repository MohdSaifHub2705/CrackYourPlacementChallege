package Patterns;

public class HallowPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		HALLOW PATTERN
//		int n = 6;
//		
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<n; j++) {
//			   if(i == 0 || i == n-1 || j == 0 || j == n-1) {
//				   System.out.print("*");
//			   } else {
//				   System.out.print(" ");
//			   }
//			}
//			System.out.println();
//		}
		
		
//		  HALLOW SQAURE PATERN with  DIAGNAL printing
		
		int n = 7;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
//				add two extra condition for diagonal printing star
				if(i == 0 || i == n-1 || j == 0 || j == n-1 || i == j || j == n-i-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
