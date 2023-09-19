class LCS {
    
    public static int LCS(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        // create 2d array
        int[][] dp = new int[m+1][n+1];
        
        // fill array with bottom up
        for(int i=1; i<=m; i++) {
            for(int j=1; j<=n; j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1]+1;
                } else {
                   dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
            // 7520141929
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "xoh";
        
        int result = LCS(str1, str2);
        
        System.out.println("LCS is : " + result);
    }
}
