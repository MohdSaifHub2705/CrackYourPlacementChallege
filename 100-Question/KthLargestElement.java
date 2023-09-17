import java.util.Random;

class kthLargestElement {
    public static void main(String[] args) {
      int nums[] = {3,5,6,1,9,4,98,34,2};
      int k = 4;
      
      int ans = findKthLargestElement(nums, k);
      
      System.out.println("Kth Largest Element is : " + ans);
    }
    
    public static int findKthLargestElement(int nums[], int k) {
        int left = 0;
        int right = nums.length-1;
        
        while(true) {
            int pivotIndex = partition(nums, left, right);
            if(pivotIndex == k-1) {
                return nums[pivotIndex];
            }else if(pivotIndex < k-1) {
                left = pivotIndex+1;
            } else {
                right = pivotIndex-1;
            }
        }
    }
    
    public static int partition(int nums[], int left, int right) {
        Random rand = new Random();
        int randomIndex = left + rand.nextInt(right-left+1);
        swap(nums, randomIndex, right);
        int pivot = nums[right];
        int i = left-1;
        
        for(int j=left; j<right; j++) {
            if(nums[j] >= pivot) {
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i+1, right);
        return i+1;
    }
    
    public static void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
