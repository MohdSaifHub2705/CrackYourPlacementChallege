class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);

        String firstChar = strs[0];
        String lastChar = strs[strs.length-1];

        for(int i=0; i<Math.min(firstChar.length(), lastChar.length()); i++) {
          if(firstChar.charAt(i) != lastChar.charAt(i)) {
            return result.toString();
          }
          result.append(firstChar.charAt(i));
        }
        return result.toString();
    }
}
