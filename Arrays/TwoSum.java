class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i=0; i<nums.length; i++) {
        //     for(int j=i+1; j<nums.length; j++) {
        //         if(nums[i]+nums[j] == target) {
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{};


        // Efficeint Appraoch

        Map<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;

        // Build the hashtable
        for(int i=0; i<n; i++) {
           mp.put(nums[i], i);
        }

        // find the complement
        for(int i=0; i<n; i++) {
          int result = target-nums[i];
          if(mp.containsKey(result) && mp.get(result) != i) {
             return new int[]{i, mp.get(result)};
          }
        }
        return new int[]{};
    }
}
