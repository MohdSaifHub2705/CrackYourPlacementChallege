class QuickSortAlgo {


  // NOTE -> choose pivot as right most element
    
    public static int partition(int arr[], int left, int right) {
        // choose right most element as pivot
        int pivotElement = arr[right];
        int i = left-1;
        
        for(int j=left; j<=right-1; j++) {
            // if curr element smaller than pivot
            if(arr[j] < pivotElement) {
                i++;  // increment the smaller index element
                // swap the i and j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;
        
        return (i+1);
    }
    public static void quickSort(int arr[], int left, int right) {
        // base case
        if(left < right) {
           int p = partition(arr, left, right); 
           //recursively sort the left and right part
           quickSort(arr, left, p-1);
           quickSort(arr, p+1, right);
        }
    }
    
    public static void printArr(int arr[], int n){
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
       int arr[] = { 24, 9, 29, 14, 19, 27 }; 
       int n = arr.length;
       
       System.out.print("Before Sorting the Array Element \n");
       printArr(arr, n);
       quickSort(arr, 0, n-1);
       System.out.print("After Sorting the Array Element- \n");
       printArr(arr, n);
    }
}
