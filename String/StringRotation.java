class HelloWorld {
    public static boolean isRotation(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        // concatenate str1 with itself str1;
        String concatenatedStr = str1 + str1;
        
        return concatenatedStr.contains(str2);
    }
    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";
        
        boolean result = isRotation(str1, str2);
        
        System.out.print(result);
    }
}
