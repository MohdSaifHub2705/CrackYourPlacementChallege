class Solution {
    public String reverseOnlyLetters(String s) {
        // convert the string into charArray
        char[] arr = s.toCharArray();

        // set two pointer low and high using binary search

        int low = 0;
        int high = s.length()-1;

        while(low < high) {
          while(low < high && !Character.isAlphabetic(arr[low])) {
            low++;
          }
          while(low < high && !Character.isAlphabetic(arr[high])) {
            high--;
          }

          // now swap the letter after ignoring the alphabetic charcter
          char  temp = arr[low];
          arr[low] = arr[high];
          arr[high] = temp;

          // finaly low increase and high decrease
          low++;
          high--;
        }

        // concatination of array to string 
        return new String(arr);
    }
}
