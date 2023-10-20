
class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int[] hash = new int[n+1];
        
        // update the hasharray
        for(int i=0; i<n; i++) {
            hash[arr[i]]++;
        }
        
        // find repeating and missing number
        int repeating = -1, missing = -1;
        for(int i=1; i<=n; i++) {
            if(hash[i] == 2) {
                repeating = i;
            } else if(hash[i] == 0) {
                missing = i;
            }else if(repeating != -1 && missing != -1) {
                break;
            }
        }
        
        int ans[] = {repeating, missing};
        return ans;
    }
}
