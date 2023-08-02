class Solution {
    public boolean canJump(int[] nums) {
        int finish=0;
        for(int i=0; i<nums.length; i++){
          if(i > finish){
            return false;
          }
          finish = Math.max(finish, nums[i]+i);
        }
        return true;
    }
}
