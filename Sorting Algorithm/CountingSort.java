class countSort {
    
    public static void countingSort(int nums[]) {
        // find largest number in unsorted Array
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            largest = Math.max(largest, nums[i]);
        }
        
        
        int count[] = new int[largest+1];
        // count the frequency of element
        for(int i=0; i<nums.length; i++) {
            count[nums[i]]++;
        }
        
        int j=0;
        // iterate count array and initialize the element with right index
        for(int i=0; i<count.length; i++) {
           while(count[i] > 0) {
            nums[j] = i;
            j++;
            count[i]--;
           }
        }
    }
    
    public static void printArr(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
    
    public static void main(String[] args) {
       int nums[] = {2,5,9,1,7,3,2,8,3,9,12};
       countingSort(nums);
       printArr(nums);
    }
}
