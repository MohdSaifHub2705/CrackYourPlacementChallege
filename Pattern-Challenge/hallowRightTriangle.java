package Patterns;

public class HallowRightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 7;
		for(int i=0; i<n; i++) {
//			for spaces print
			for(int k=i; k<n; k++) {
				System.out.print(" ");
			}
//			print the star
			for(int j=0; j<n; j++) {
				if(j == 0 || i == j || i == n-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
