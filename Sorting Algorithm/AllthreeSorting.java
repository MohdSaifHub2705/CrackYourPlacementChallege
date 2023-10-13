
class SortingAgo {
    
    static void bubbleSort(int nums[]) {
        int n = nums.length;
        for(int i=0; i<n-1; i++) {
            boolean swapped =  false;
            for(int j=0; j<n-i-1; j++) {
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }
    
    
    static void selectionSort(int nums[]) {
        int n=nums.length;
        for(int i=0; i<n-1; i++) {
            int minIndex = i;
            for(int j=i+1; j<n; j++) {
                if(nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
    }
    
    static void insertionSort(int nums[]) {
        int n = nums.length;
        
        for(int i=1; i<n; i++) {
            // store the first element in key variable
            int key = nums[i];
            int j = i-1;
            
            while(j >= 0 && nums[j] > key) {
                nums[j+1] = nums[j];
                j = j-1;
            }
            nums[j+1] = key;
        }
    }
    
    static void printArray(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[] = {5,2,1,9,4,3,7};
        
        
        // bubbleSort(nums);
        // selectionSort(nums);
        insertionSort(nums);
        
        
        System.out.println("Sorted Array is ");
        printArray(nums);
    }
}
