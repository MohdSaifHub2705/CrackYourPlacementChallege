class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) {
           return 0;
        }
        int n = s.length();
        int maxLength = 0;
        int left = 0;


        HashMap<Character, Integer> map = new HashMap<>();

        for(int right=0; right < n; right++) {
          char currChar = s.charAt(right);

          if(map.containsKey(currChar)) {
            left = Math.max(left, map.get(currChar)+1);
          }

          map.put(currChar , right);

          maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
}
