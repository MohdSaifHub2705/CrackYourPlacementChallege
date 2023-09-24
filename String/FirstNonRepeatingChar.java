
class HelloWorld {
    
    public static Character firstNonReating(String str) {
        for(char c : str.toCharArray()) {
            if(str.indexOf(c) == str.lastIndexOf(c)) {
                return c;
            }
        }
        return null;
    }
    public static void main(String[] args) {
       String str = "analogy";
       System.out.print("First Non Repeating Character is : " + firstNonReating(str));
    }
}
