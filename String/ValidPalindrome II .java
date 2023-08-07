class Solution {
    public boolean validPalindrome(String s) {
         int left = 0;
         int right = s.length()-1;

         char[] str = s.toCharArray();

         while(right > left) {
           if(str[left] == str[right]) {
             left++;
             right--;
           } else {
              return isRemainPalindrome(left+1, right, s) || isRemainPalindrome(left, right-1, s);
           }
         } 
         return true;
    }

    public boolean isRemainPalindrome(int left , int right, String s){
      char[] str = s.toCharArray();
      while(right > left) {
         if(str[left] == str[right]) {
            left++;
            right--;
         } else {
           return false;
         }
      }
      return true;
    }
}
