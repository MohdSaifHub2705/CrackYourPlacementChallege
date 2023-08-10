class Solution {
    public boolean search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;

        // left part is less than right part 
        while(left <= right) {
          //  find mid element
          int mid=left+(right-left)/2;
          //check if mid = target
          if(nums[mid] == target) {
             return true;
          } else if(nums[mid] == nums[left] && nums[mid] == nums[right]) {
             left =  left+1;
             right = right-1;
            //  left part searching 
          } else if(nums[mid] >= nums[left]) {
              if(target >= nums[left] && target < nums[mid]) {
                //  mid back find left part target
                 right = mid-1;
              } else {
                 left = mid+1;
                //  right part searching
              }
          } else if(nums[mid] <= nums[right]) {
              if(target >= nums[mid] && target <= nums[right]) {
                 left = mid+1;
              } else {
                right = mid-1;
              }
          }
        }
        // element target not found return false;
        return false;
    }
}
