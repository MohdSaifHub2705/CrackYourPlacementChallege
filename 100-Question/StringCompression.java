class HelloWorld {
    
    public static String stringComperssion(String str) {
        // check if String is null or empty
        if(str == null || str.isEmpty()) {
            return str;
        }
        
        // create stringbuilder function
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        
        for(int i=1; i<str.length(); i++) {
            // char is same then increment the count variable
            if(str.charAt(i) == str.charAt(i-1)) {
                count++;
            } else {
                // if not same then append the char with (i-1)
              compressed.append(str.charAt(i-1)).append(count);
              count = 1;  //reset the count variable for new ch
            }
            //if com length is greater then return original str
            if(compressed.length() >= str.length()) {
                return str;
            }
        }
        // append the last char with count variable
        compressed.append(str.charAt(str.length()-1)).append(count);
        
        // if compre stirng is less so return comp str otherwise return original string
        return compressed.length() < str.length() ? compressed.toString() : str;
    }
    
    public static void main(String[] args) {
        String str =  "aaaabbcccddd";
        String result = stringComperssion(str);
        
        System.out.println("Original String is : " + str);
        System.out.println("Compressed String is : " + result);
    }
}
