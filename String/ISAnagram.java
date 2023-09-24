class StringAnagram {
    
    public static boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        
        for(int i=0; i<str1.length(); i++) {
            char c = str1.charAt(i);
            int index = str2.indexOf(c);
             // If index of any character is -1, then two strings are not anagrams
            // If index of character is not equal to -1, then remove the chacter from the
            // String
            
            if(index != -1) {
                str2 = str2.substring(0, index) + str2.substring(index + 1, str2.length());
            } else {
                return false;
            }
        }
        return str2.isEmpty();
    }
    public static void main(String[] args) {
        String str1 = "car";
        String str2 = "rac";
        
        System.out.print("String Anagram is : " + isAnagram(str1, str2));
    }
}
