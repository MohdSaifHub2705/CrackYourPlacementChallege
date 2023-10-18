import java.util.Arrays;
class NextPermu {
    
    static void printNextPermu(int nums[]) {
        int i = nums.length-2;
        // Find the first decreasing element from the right
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        
        // If such an element exists, find the smallest element to its right that is greater
        if(i >= 0) {
            int j = nums.length-1;
            while(nums[j] <= nums[i]) {
              j--;
            }
            swap(nums, i, j);
        }
        // Reverse the subarray to the right of i
        reverse(nums, i+1);
    }
    static void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    static void reverse(int nums[], int start) {
        int end = nums.length-1;
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;;
            start++;
            end--;
        }
    }
    
    static void print(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        NextPermu np = new NextPermu();
        int nums[] = {1,2,3};
        np.printNextPermu(nums);
        System.out.println(Arrays.toString(nums) + " ");
        
    }
}
