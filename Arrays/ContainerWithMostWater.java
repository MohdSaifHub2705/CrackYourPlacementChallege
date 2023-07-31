class Solution {
    public int maxArea(int[] height) {

     
        int left=0;
        int right=height.length-1;

        int max=0;
         while(left < right) {
             int left_height = height[left];
             int right_height = height[right];

             int min_height = Math.min(left_height, right_height);
             int length = right-left;

             int curr_Area = min_height * length;

             max = Math.max(max , curr_Area);

             if(left_height < right_height) {
               left++;
             } else {
               right--;
             }
         }
         return max;

    }
}
