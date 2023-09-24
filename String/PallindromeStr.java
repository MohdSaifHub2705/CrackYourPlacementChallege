class HelloWorld {
    public static void main(String[] args) {
        String str = "racecar";
        if(isPallindrome(str)) {
            System.out.println("String is Pallindrome : " + str);
        } else {
            System.out.println("String is not Pallindrome : " + str);
        }
    } 
    public static boolean isPallindrome(String str ) {
        // remove all white spaces and convert str lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = str.length()-1;
        
        while(left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
