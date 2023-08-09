package Patterns;

public class HalfDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 4;
	
//		first print the right triangle
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		print the inverted right triangle
		
		for(int i=0; i<n-1; i++) {
			for(int j=i; j<n-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
