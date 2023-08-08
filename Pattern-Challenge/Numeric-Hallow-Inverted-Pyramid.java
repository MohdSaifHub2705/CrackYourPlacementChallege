package Patterns;

public class HollowInvertedPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<=n; j++) {
				if(j == i+1 || j == n || i == 0) {
					System.out.print(j);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
