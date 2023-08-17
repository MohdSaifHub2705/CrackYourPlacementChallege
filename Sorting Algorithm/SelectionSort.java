class HelloWorld {
    
     public static void selectionSort(int nums[]) {
         for(int i=0; i<nums.length-1; i++) {
             int minimumNumber = i;
             for(int j=i+1; j<nums.length; j++) {
                 if(nums[minimumNumber] > nums[j]) {
                    minimumNumber = j; 
                 }
             }
            //  swap the whole array
            int temp = nums[minimumNumber];
            nums[minimumNumber] = nums[i];
            nums[i] = temp;
          }
     }
    
    public static void print(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        int nums[] ={5,4,1,3,2,9,7,8,6};
        selectionSort(nums);
        print(nums);
    }
}
