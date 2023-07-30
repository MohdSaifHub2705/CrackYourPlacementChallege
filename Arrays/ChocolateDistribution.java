class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        
        // Sort the list 
        Collections.sort(a);
        
        // define variable to store min diffrence
        long minDiff = Integer.MAX_VALUE;
        
        for(int i=0; i<=a.size()-m; i++) {
            if(a.get(i+m-1)-a.get(i) < minDiff) {
                minDiff = a.get(i+m-1)-a.get(i);
            }
        }
        return minDiff;
    }
}
