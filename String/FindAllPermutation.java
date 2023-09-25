import java.util.List;
import java.util.ArrayList;

class findPermutation {
    
    public static List<String> findAllPer(String str) {
        List<String> permu = new ArrayList<>();
         findPermutations("", str, permu);
         return permu;
    }
    
    public static void findPermutations(String prefix, String remaining, List<String> permutation) {
        int n = remaining.length();
        // base case
        if(n == 0) {
            permutation.add(prefix);
        } else {
            for(int i=0; i<n; i++) {
                // choose the ith character
                char currChar = remaining.charAt(i);
                // create newPrefix to add choosen char
                String newPrefix = prefix + currChar;
                // create newRemaining char without choosen cha
                String newRemaining = remaining.substring(0, i) + remaining.substring(i+1);
                
                // Recursively find permutations with the new prefix and remaining string
                findPermutations(newPrefix, newRemaining, permutation);
            }
        }
    }
    
    public static void main(String[] args) {
       String str = "abc";
       List<String> permu = findAllPer(str);
       
       for(String permutation : permu) {
           System.out.println(permutation);
       }
    }
}
