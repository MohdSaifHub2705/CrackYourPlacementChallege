class Solution {
    public int search(int[] nums, int target) {
       int n = nums.length;
       int pivot = findpivot(nums, 0, n-1);

       if(pivot == -1) {
         return binarySearch(nums, 0, n-1, target);
       }

       if(nums[pivot] == target) {
         return pivot;
       }
        
        if(nums[0] <= target) {
          return binarySearch(nums,0, pivot-1, target);
        }

        return binarySearch(nums, pivot+1, n-1, target);
    }

    // find pivot index
    private int findpivot(int[] nums, int low, int high) {
      // base case
      if(high < low) {
        return -1;
      }

      if(high == low) {
        return low;
      }

      // finding the mimddle elemnt
      int mid = low+(high-low)/2;

      if(mid < high && nums[mid] > nums[mid+1]) {
        return mid;
      } else if(mid > low && nums[mid] < nums[mid-1]) {
        return mid-1;
      } else if(nums[low] >= nums[mid]) {
           return findpivot(nums, low, mid-1);
      } else {
        return findpivot(nums, mid+1, high);
      }
    }

    // binary search function

    private int binarySearch(int nums[],int low , int high, int target) {
       while(low <= high) {
         int mid = low+(high-low)/2;

         if(nums[mid] == target) {
           return mid;
         }else if(nums[mid]  > target) {
           high = mid-1;
         } else {
           low = mid+1;
         }
       }
       return -1;
    }
}
