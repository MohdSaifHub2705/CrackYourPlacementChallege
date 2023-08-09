package Patterns;

public class InvertedPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=8;
//		reverse row loop for inverted pyramid print
		for(int i=n; i>=0; i--) {
			for(int k=i; k<n; k++) {
				System.out.print(" ");
			}
			
//			only column loop revese to print inverted pyramid
			for(int j=2*i; j>1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
