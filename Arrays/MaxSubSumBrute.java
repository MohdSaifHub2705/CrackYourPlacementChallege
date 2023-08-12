package TCS;
import java.util.*;

public class GCD {
	
	public static void printSubArraysSum(int numbers[]) {
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
	    for(int i=0; i<numbers.length; i++) {
	    	int start = i;
	    	for(int j=i; j<numbers.length; j++) {
	    		int end = j;
	    		currSum = 0;
	    		for(int k=start; k<=end; k++) {
	    			currSum += numbers[k];
//	    			System.out.print(numbers[k] +" ");
	    		}
	    		System.out.print(currSum+" | ");
	    		if(maxSum < currSum) {
	    			maxSum = currSum;
	    		}
	    	}
	    }
	    System.out.println("Max Sum of Subarrays is = " + maxSum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[] = {2,4,6,8,10};
		printSubArraysSum(numbers);
	}
	

}




package TCS;
import java.util.*;

public class GCD {
	
	public static void printSubArraysSum(int numbers[]) {
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		int prefix[] = new int[numbers.length];
		prefix[0] = numbers[0];
		 
		for(int i=1; i<prefix.length; i++) {
			prefix[i] = prefix[i-1]+numbers[i];
		}
		
	    for(int i=0; i<numbers.length; i++) {
	    	int start = i;
	    	for(int j=i; j<numbers.length; j++) {
	    		int end = j;
	    		currSum = 0;
	    		currSum = start == 0 ? prefix[end] : prefix[end]-prefix[start-1];
	    		System.out.print(currSum+" | ");
	    		if(maxSum < currSum) {
	    			maxSum = currSum;
	    		}
	    	}
	    }
	    System.out.println("Max Sum of Subarrays is = " + maxSum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[] = {2,4,6,8,10};
		printSubArraysSum(numbers);
	}
	

}
