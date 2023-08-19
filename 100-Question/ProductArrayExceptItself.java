class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n =  nums.length;
       int[] leftp =  new int[n];
       int[] rightp  = new int[n];
       int[] result = new int[n];

       int lp = 1;
       for(int i=0; i<n; i++) {
          leftp[i] = lp;
          lp *= nums[i];
       }
       int rp = 1;
       for(int i=n-1; i>=0; i--) {
         rightp[i] = rp;
         rp *= nums[i];
       }

       for(int i=0; i<n;i++) {
         result[i] = leftp[i] * rightp[i];
       }
        return result;
    }
}
