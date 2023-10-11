class Digit {
    public static void main(String[] args) {
       int num = 12345;
       int ans = reverseDigit(num);
       System.out.println("Original Number is : " + num);
       System.out.println("Reverse Number is : " + ans);
    }
    
    public static int reverseDigit(int num) {
        int reverse = 0;
        while(num != 0) {
            int digit = num % 10;  //get the last digit
            reverse = reverse * 10 + digit;
            num /= 10;  // remove last digit
        }
        return reverse;
    }
}
