class Array {
    
    public static int searchRotatedArr(int nums[], int target) {
        int left=0;
        int right=nums.length-1;
        
        while(left <= right) {
            // find mid element
            int mid = left+(right-left)/2;
            // check target is mid element
            if(nums[mid] == target) {
                return mid;
            }
            
            // check left part is sorted
            if(nums[left] <= nums[mid]) {
                if(target > nums[left] && target < nums[mid]) {
                    // search in left part
                    right = mid-1;
                } else {
                    // search in right part
                    left = mid+1;
                }
            } else {
                // check right part is sorted
                if(target > nums[mid] && target < nums[right]) {
                    left = mid+1; // search in right part
                } else {
                    right = mid-1; // search in left part
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {5,6,7,8,9,1,2,3,4};
        int target = 9;
        int result = searchRotatedArr(nums, target);
        
        if(result != -1) {
            System.out.println(" Element : " + target + " found at index : " + result);
        } else {
            System.out.println(" Element : " + target + " not found in the given array ");
        }
    }
}
