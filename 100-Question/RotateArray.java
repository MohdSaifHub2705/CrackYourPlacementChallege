
class RotateArray {
    public static void main(String[] args) {
       int nums[] = {1,2,3,4,5,6,65,32,9,54,12};
       int k = 8;
       
       rotateArray(nums, k);
       
       System.out.print("Rotate Array : " );
       
       for(int num : nums) {
           System.out.print(num + " ");
       }
       
    }
    
    public static void rotateArray(int nums[],int k) {
        int n = nums.length;
        k %= n;  // Handle cases where k is larger than the array length
        
        // reverse the entire array
        reverse(nums, 0 , n-1);
        
        // reverse first part of array
        reverse(nums, 0, k-1);
        
        // reverse second half af array
        reverse(nums, k , n-1);
        
    }
    
    public static void reverse(int nums[], int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
