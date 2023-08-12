package TCS;
import java.util.*;

public class GCD {
	
	public static void printPairs(int numbers[]) {
		int totalPairs = 0;
		for(int i=0; i<numbers.length; i++) {
			int curr = numbers[i];
			for(int j=i+1; j<numbers.length; j++) {
				System.out.print("(" + curr + "," + numbers[j] + ")");
				totalPairs++;
			}
			System.out.println();
		}
		System.out.print("Total Pairs is : " + totalPairs);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[] = {1,2,3,4,55,6};
	    printPairs(numbers);
	    
	}
	

}
