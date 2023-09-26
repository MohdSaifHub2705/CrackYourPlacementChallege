
class HelloWorld {
    
    public static int findmin(int nums[]) {
        int left = 0;
        int right = nums.length-1;
        
        while(left < right) {
            int mid = left+(right - left)/2;
            
            if(nums[mid] > nums[right]) {
                // right half is sorted
                left = mid+1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
    
    public static void main(String[] args) {
       int nums[] = {4,5,6,7,3};
       int min = findmin(nums);
       
       System.out.println("Minimum Element is : " + min);
    }
}
