package Patterns;

public class NumericPalindromePyra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		int k = n;
		
//		outer loop always run n tak 
		for(int i=0; i<n; i++) {
//			inner loop logic implementation
//			column start always 1 after printing the spaces 
			int c=1;
//			column start k = 5 tab print karenge numeric
			for(int j=0; j<k; j++) {
//				steps 1st print the spaces
				if(j < n-i-1) {
					System.out.print(" ");
				}
//				afterr printing the space start print the numric value
				else if(j <= n-1) {
					System.out.print(c);
					c++;
				}   // first half pyramuid successfully print
//				print the half   pyramid in reverse order
				else if(j == n) {
					c = c-2;
					System.out.print(c);
					c--;
				}
				else {
					System.out.print(c);
					c--;
				}
			}
			k++;
			System.out.println();
			
		}

	}

}
