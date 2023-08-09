package Patterns;

public class RohmbusPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =7;
		for(int i=0; i<n; i++) {
//			before printing the start first print spaces with thier rows
			for(int k=0; k<n-i; k++) {
				System.out.print(" ");
			}
//			print the star of each column
			for(int j=0; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
