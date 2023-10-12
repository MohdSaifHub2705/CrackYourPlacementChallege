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
