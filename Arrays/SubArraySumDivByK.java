class Solution {
    public int subarraysDivByK(int[] nums, int k) { 
       HashMap<Integer, Integer> map = new HashMap<>();
       map.put(0,1);

       int sum=0;
       int count=0;

       for(int i=0; i<nums.length; i++) {
           sum += nums[i];
           int key = (sum%k + k)%k;
           count += map.getOrDefault(key,0);
           map.put(key, map.getOrDefault(key,0)+1);
       }
       return count;
    }
}
