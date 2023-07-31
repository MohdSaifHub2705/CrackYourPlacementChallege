class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        // sort the input array for reducing time complexity
        Arrays.sort(nums);

        for(int i=0; i<n-2; i++) {
          //  skip duplicate for the first element
          if(i>0 && nums[i]==nums[i-1]) {
            continue;
          }
          // find left and right pointer 
          int left=i+1;
          int right=n-1;

          while(left < right) {
              int sum = nums[i] + nums[left] + nums[right];

              if(sum == 0) {
                 result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                //  skip duplicates for the second and third elements
                while(left < right && nums[left] == nums[left+1]) {
                   left++;
                }
                while(left < right && nums[right] == nums[right-1]) {
                  right--;
                }
                left++;
                right--;
              } else if(sum < 0) {
                left++;
              } else {
                right--;
              }
          }
        }
        return result;
    }
}
