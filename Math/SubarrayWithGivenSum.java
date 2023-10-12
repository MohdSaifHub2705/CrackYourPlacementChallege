class Arrays {
    
    static void printFindSubArr(int[] nums, int n, int sum) {
        for(int i=0; i<n; i++) {
            int currentSum = nums[i];
            if(currentSum == sum) {
                System.out.println("Subarray FOund at Index :" + i);
                return;
            } else {
                for(int j=i+1; j<n; j++) {
                    currentSum += nums[j];
                    if(currentSum == sum) {
                        System.out.println("Subarray Found at Index " + i + " and " + j);
                        
                        return;
                    }
                }
            }
        }
        System.out.println("No Subarray Found");
        return;
    }
    
    public static void main(String[] args) {
        
        Arrays arr = new Arrays();
        int[] nums = {4,6,9,1,7,3,2};
        int sum = 5;
        int n = nums.length;
        
        arr.printFindSubArr(nums, n, sum);
    }
}

















// Sliding window algo



class Subarray {
    
    static int[] findSubarrayWithSum(int[] nums, int targetSum) {
        if(nums == null || nums.length == 0) {
            return new int[] {-1,-1};
        }
        int left = 0;
        int right = 0;
        int currentSum = 0;
        
        while(right < nums.length) {
            currentSum +=  nums[right];
            
            while(currentSum > targetSum && left <= right) {
                // remove curent sum from left and move pointer
                currentSum -= nums[left];
                left++;
            }
            if(currentSum == targetSum) {
                return new int[]{left, right};
            }
            right++;
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int targetSum = 40;
                int[] subarray = findSubarrayWithSum(nums, targetSum);

        if (subarray[0] == -1) {
            System.out.println("No subarray found with the given sum.");
        } else {
            System.out.println("Subarray with the sum " + targetSum + ":");
            for (int i = subarray[0]; i <= subarray[1]; i++) {
                System.out.print(nums[i] + " ");
            }
        }

    }
}
