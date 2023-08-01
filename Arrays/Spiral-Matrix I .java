class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        ArrayList<Integer> result = new ArrayList<>();
        int m = matrix.length;  // rows of matrix
        int n = matrix[0].length;   // col of matrix

        if(matrix == null || matrix.length == 0) {
            return result;
        }

        int x=0;  // rows of matrix direction
        int y=0;  // cols of matrix direction

        while(m > 0 && n > 0) {
            if(m == 1) {          // only one row present
                for(int i=0; i<n; i++) {
                    result.add(matrix[x][y++]);
                }
                break;
            }  else if(n == 1) {  // only one column present
                  for(int i=0; i<m; i++) {
                      result.add(matrix[x++][y]);
                  }
                  break;
            }
          
          // main case of the question there are four different cases

           // case 1 : move top right to last column

           for(int i=0; i<n-1; i++) {
               result.add(matrix[x][y++]);
           } 

           // case 2 : move top to bottom

           for(int i=0; i<m-1; i++) {
               result.add(matrix[x++][y]);
           }


           // case 3 : move bottom right se bottom left

           for(int i=0; i<n-1; i++) {
               result.add(matrix[x][y--]);
           }

           // case 4 : move bottom left to top left

           for(int i=0;  i<m-1; i++) {
               result.add(matrix[x--][y]);
           }

           x++;
           y++;
           m = m-2;
           n = n-2;

        }

        return result;


        // List<Integer> result = new ArrayList<>();
        
        // if(matrix == null || matrix.length == 0) {
        //   return result;
        // }

        // int row = matrix.length;
        // int col = matrix[0].length;
        // // four pointer initialize
        // int left = 0;
        // int right = col-1;
        // int top = 0;
        // int bottom = row-1;

        // while(left <= right && top <= bottom) {
        //     for(int i=left; i<=right; i++) {
        //       result.add(matrix[top][i]);
        //     }  top++;
        //     for(int i=top; i<=bottom; i++) {
        //       result.add(matrix[i][right]);
        //     } right--;
        //     if(top <= bottom) {
        //       for(int i=right; i>=left; i--) {
        //         result.add(matrix[bottom][i]);
        //       } bottom--;
        //     }
        //     if(left <= right) {
        //       for(int i=bottom; i>=top; i--) {
        //         result.add(matrix[i][left]);
        //       }left++;
        //     }
        // }
        // return result;
    }
}
