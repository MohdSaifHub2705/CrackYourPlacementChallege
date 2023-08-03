class Solution {
    public int majorityElement(int[] nums) {
        // intialize the variable to keep track of majority element
        int count=0;
        int majority=0;

        for(int i=0; i<nums.length; i++) {
          // if count is 0 and the current majority candidate isnot eqal to curr ele.
          // update the majority to nums and count set 1;
          if(count == 0 && majority != nums[i]) {
             majority=nums[i];
             count=1;
          } else if(majority == nums[i]) {
            count++;
          } else {
            count--;
          }
        }
        return majority;
    }
}
