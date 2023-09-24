import java.util.Map;
import java.util.HashMap;

class HelloWorld {
     
     public static void findDuplicate(String str) {
         Map<Character, Integer> charCount = new HashMap<>();
         
        //  convert string to char array
        char[] ch = str.toCharArray();
        
        // iterate through char array
        for(char c : ch) {
            if(charCount.containsKey(c)) {
                // If the character is already in the map, increment its count
                charCount.put(c, charCount.get(c) + 1);
            } else {
                 // If the character is not in the map, add it with a count of 1
                 charCount.put(c, 1);
            }
        }
        
        // iterate through charCount mp to print duplicate value
        for(Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if(entry.getValue() > 1) {
                System.out.println( " Duplicate Character : " + entry.getKey() + " count " + entry.getValue());
            }
        }
     }
    
    public static void main(String[] args) {
        String str = "abcdefgaddde";
        findDuplicate(str);
    }
}
