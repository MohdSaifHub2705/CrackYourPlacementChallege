package Patterns;

public class NumericHalfPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10;
		for(int row = 0; row<n; row++) {
			for(int col=0; col <=row; col++) {
				if(col == 0 || col == row || row == n-1) {
					System.out.print(col+1);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
