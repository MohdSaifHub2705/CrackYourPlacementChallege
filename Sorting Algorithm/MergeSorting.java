
class MergeSort {
    
    static void merge(int nums[], int si, int mid, int ei) {
        int merged[] = new int[ei-si+1];
        int idx1=si;
        int idx2 = mid+1;
        int x = 0;
        
        while(idx1 <= mid && idx2 <= ei) {
            if(nums[idx1] <= nums[idx2]) {
                merged[x] = nums[idx1];
                x++;
                idx1++;
            } else {
                merged[x] = nums[idx2];
                x++;
                idx2++;
            }
        }
        while(idx1 <= mid) {
          merged[x] = nums[idx1];
          x++;
          idx1++;
        }
        while(idx2 <= ei) {
           merged[x] = nums[idx2];
           x++;
           idx2++;
        }
        
        
        // copy in original array
        
        for(int i=0, j=si; i<merged.length; i++, j++) {
            nums[j] = merged[i];
        }
    }
    
    static void mergeSort(int nums[], int si, int ei) {
        if(si >= ei) {
            return;
        }
        
        int mid = si+(ei-si)/2;
        mergeSort(nums, si, mid);
        mergeSort(nums, mid+1, ei);
        
        merge(nums, si, mid, ei);
        
    }
    
    static void printArray(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int nums[] = {5,3,1,98,43,6,9,4};
        int n = nums.length;
        mergeSort(nums, 0, n-1);
        printArray(nums);
    }
}
