class HelloWorld {
    public static boolean UniqueChar(String word) {
        for(int i=0; i<word.length(); i++) {
            char c = word.charAt(i);
            
            if(word.indexOf(c) != word.lastIndexOf(c)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Unique Character is : " + UniqueChar("carsa"));
    }
}
