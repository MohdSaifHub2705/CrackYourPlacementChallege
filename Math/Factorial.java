class HelloWorld {
    public static void main(String[] args) {
        int num = 6;
        int result = factorial(num);
        System.out.println("Factorial is : " + result);
    }
    
    public static int factorial(int num) {
        // base case
        if(num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num-1);
    }
}
