// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class SortingAlgo {
    
    static void bubbleSort(int nums[]) {
        int n = nums.length;
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i-1; j++) {
                if(nums[j] > nums[j+1]) {
                    // swap the list
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
    
    static void selectionSort(int nums[]) {
        int n = nums.length;
        
        for(int i=0; i<n-1; i++) {
            int minIndex = i;
            for(int j=i+1; j<n; j++) {
                if(nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }
    
    static void insertionSort(int nums[]) {
        int n = nums.length;
        for(int i=1; i<n; i++) {
            int key = nums[i];
            int j = i-1;
            
            // check the conditions and shift the value not swap
            while(j >= 0 && nums[j] > key){
                nums[j+1] = nums[j];
                j = j-1;
            }
            nums[j+1] = key;
        }
    }
    
    //merge function implementation
    static void merge(int nums[], int l, int m, int r) {
        // find the length in left subarray
        int n1 = m-l+1;
        // find the length in right subarray
        int n2 = r-m;
        
        // create temp arrays to hold the subarrays
        int left[] = new int[n1];
        int right[] = new int[n2];
        
        // copy data to left temp arrays
        for(int i=0; i<n1; i++) {
            left[i] = nums[l + i];
        }
        // copy data to right temp arrays
        for(int j=0; j<n2; j++) {
            right[j] = nums[m + 1 + j];
        }
        
        // intitial indexes of the first and second subarrays
        int i=0,j=0;
        // initial indexes of the merged subarrays
        int k=l;
        
        while(i < n1 && j < n2) {
            if(left[i] <= right[j]) {
                nums[k] = left[i];
                i++;
            } else {
                nums[k] = right[j];
                j++;
            }
            k++;
        }
        
        // copy remaining elements left[] if any
        while(i < n1) {
            nums[k] = left[i];
            i++;
            k++;
        }
          // copy remaining elements right[] if any
        while(j < n2) {
            nums[k] = right[j];
            j++;
            k++;
        }
    }
     static void mergeSort(int nums[], int l, int r){
        if(l < r) {
            int mid = (l+r)/2;
            
            mergeSort(nums, l, mid);
            mergeSort(nums, mid+1, r);
            merge(nums, l, mid, r);
        }
    }
    
    
    public static void main(String[] args) {
       int nums[] = {2, 4,1,7,3, 9,8,3,1};
       
        // bubbleSort(nums);
        // selectionSort(nums);
        // insertionSort(nums);
        
        System.out.println("Given array is");
        for(int value: nums) {
            System.out.print(value+" ");
        }
        
        System.out.println();
        
        
        mergeSort(nums, 0, nums.length-1);
    
    System.out.println("Sorted array is");
      for(int i=0; i<nums.length; i++) {
          System.out.print(nums[i]+" ");
      }
    }
}
