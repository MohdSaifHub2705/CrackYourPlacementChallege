class GCD {
    
    public static int printGCD(int a, int b) {
         int i;
         if(a < b) {
             i = a;
         } else {
             i = b;
         }
         
         for(i=i; i>1; i--) {
             if(a%i == 0 && b%i == 0) {
                 return i;
             }
         }
         return 1;
    }
    
    public static void main(String[] args) {
        int a = 40;
        int b = 50;
        
        System.out.println("The GCD is : "+ printGCD(a, b));
    }
}
