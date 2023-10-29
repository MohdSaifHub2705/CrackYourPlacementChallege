import java.util.ArrayList;
import java.util.List;

class HelloWorld {
    
    public static List<List<Integer>> Subsets(int nums[]) {
        List<List<Integer>> subset = new ArrayList<>();
        generateAllSubsets(nums, 0, new ArrayList<>(), subset);
        return subset;
    }
    
    public static void generateAllSubsets(int[] nums, int index, List<Integer> curr, List<List<Integer>> subset) {
        // base case if we reach last element in an array
        if(index == nums.length) {
            subset.add(new ArrayList<>(curr));
            return;
        }
        
        // include the curr element in subset
        curr.add(nums[index]);
        generateAllSubsets(nums, index+1, curr, subset);
        
        // exclude the curr element in a subset remove last el
        curr.remove(curr.size()-1);
        generateAllSubsets(nums, index+1, curr, subset);
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = Subsets(nums);

        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
