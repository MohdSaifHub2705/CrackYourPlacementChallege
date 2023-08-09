package Patterns;

public class HallowPyaramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int n = 8;
	    for(int i=0; i<n; i++) {
//	       print space
	    	for(int k=i; k<n; k++) {
	    		System.out.print(" ");
	    	}
//	    	main concept print hollow pyramid
	    	for(int j=0; j<=2*i; j++) {
	    		 // We print '*' for first and last column of each row.
	            // and complete for the last row 
	    		if(j == 0 || j == 2*i || i == 0 || i == n-1) {
	    			System.out.print("*");
	    		} else {
	    			System.out.print(" ");
	    		}
	    	}
	    	System.out.println();
	    }

	}

}
