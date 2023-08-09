package Patterns;

public class HallowInvertedTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int n =7;
	    for(int i=0; i<n; i++) {
//	    	inner reverse order running
	    	for(int j=n; j>=i; j--) {
//	    		print the first row and first column
	    		if(j == n || j == i+1 || i == 0) {
	    			System.out.print("*");
	    		}else {
	    			System.out.print(" ");
	    		}
	    	}
	    	System.out.println();
	    }

	}

}
