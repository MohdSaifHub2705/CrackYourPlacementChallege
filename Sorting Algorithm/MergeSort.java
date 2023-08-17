class MergeSort {
    
    // merge sort function
    public static int[] mergeSort(int[] nums, int firstIndex, int lastIndex) {
        
        // base case 
        if(firstIndex == lastIndex) {
            // putting the single element in new Array
            int res[] = new int[1];
            res[0] = nums[firstIndex];
            return res;
        }
        
        // find the mid element
        int mid = firstIndex + (lastIndex - firstIndex)/2;
        // sort the left part and right part recursively
        int[] leftSide = mergeSort(nums,firstIndex, mid);
        int[] rightSide = mergeSort(nums, mid+1, lastIndex);
        
        // merge the left and right array into single array
        int ans[] = mergeTwoSortedArray(leftSide, rightSide);
        
        return ans;
    }
    
    // write function for merge two sorted array
    
    public static int[] mergeTwoSortedArray(int nums1[], int nums2[]) {
        // all three pointer points the 0th index of num1 num2 num3
        
        int p1=0;
        int p2=0;
        int p3=0;
        
        int[] nums3 = new int[nums1.length + nums2.length];
        
        // condition for merging two sorted array
        while(p1 < nums1.length && p2 < nums2.length) {
            if(nums1[p1] <= nums2[p2]) {
              //p1 copy to arr3 p3 index
              nums3[p3] = nums1[p1];
              // update the p1 and p3
              p1++;
              p3++;
            }else {
                nums3[p3] = nums2[p2];
                // update the p2 and p3
                p2++;
                p3++;
            }
        }
        
        // check for single element
        while(p1 < nums1.length) {
            nums3[p3] = nums1[p1];
            p3++;
            p1++;
        }
        while(p2 < nums2.length) {
            nums3[p3] = nums2[p2];
            p3++;
            p2++;
        }
        return nums3;
    }
    
    public static void printArr(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    
    
    public static void main(String[] args) {
       int nums[] = {90,40,10,50,60,15,20};
       int[] result = mergeSort(nums, 0, nums.length-1);
       System.out.print("Sorted Array is -> ");
       printArr(result);
    }
}
