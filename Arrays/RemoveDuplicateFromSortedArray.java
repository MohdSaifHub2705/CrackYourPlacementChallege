class Solution {
    public int removeDuplicates(int[] nums) {
        int StartIndex=0;
        for(int secondIndex=0; secondIndex<nums.length; secondIndex++) {
           if(nums[StartIndex] != nums[secondIndex]) {
              StartIndex++;
              nums[StartIndex] = nums[secondIndex];
           }
        }
        return StartIndex+1;
    }
}
