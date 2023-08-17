class HelloWorld {
    
    public static void bubbleSort(int nums[]) {
        boolean swap;
        for(int i=0; i<nums.length-1; i++) {
            swap = false;
            for(int j=0; j<nums.length-1-i; j++) {
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    // check array is already sorted to decrese time complexity
                    swap = true;
                }
            }
              if(swap == false) {
                  break;
            }
        }
    }
    
    public static void print(int nums[]) {
        for(int i=0; i<nums.length-1; i++) {
            System.out.print(nums[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        int nums[] = {2,5,9,1,9,0,3};
        bubbleSort(nums);
        print(nums);
    }
}
