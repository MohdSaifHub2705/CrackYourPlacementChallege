class Solution {
    public List<List<Integer>> generate(int numRows) {
       
       List<List<Integer>> result = new ArrayList<>();
       for(int row = 1; row <= numRows; row++) {
          List<Integer> tempal = new ArrayList<>();
          for(int col = 1; col <= row; col++) {
            tempal.add(ncr(row-1, col-1));
          }
           result.add(tempal);
       } 
       return result;
    }

    // calculate ncr
   private int ncr(int n, int r) {
      long res = 1;
      for(int i=0; i<r; i++) {
        res = res * (n-i);
        res = res / (i+1);
      }
      return (int) res;
    }
}
