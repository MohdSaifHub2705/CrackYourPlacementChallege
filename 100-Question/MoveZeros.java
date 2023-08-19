class Solution {
    public void moveZeroes(int[] nums) {
        
        // Initialize the pointer j to keep track where the next non zero element will be moved
        int j=0;

        // Loop through array
        for(int i=0; i<nums.length; i++) {
            // If the current element is not Zero
            if(nums[i] != 0) {
                // Move the non-zero element to the position indicated by j, then increment j
                // As a result all non-zero elements will be moved towards the front of the array in same order they appeared
                nums[j]=nums[i];
                j++;
            }
        }
        // After all non-zero elements have been moved to the front of the aray
        // all remaining positions from index j to end of the array should be filled with zeros;
        for(int lastIndex = j; lastIndex<nums.length; lastIndex++) {
            // all zero shift last index in array
            nums[lastIndex] = 0;
        }
    }
  }
