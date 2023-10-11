import java.util.Scanner;
class Multiplication{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Number : " );
        int number = sc.nextInt();
        int tableSize = 10;
        
        System.out.println("Multiplication is = " + number + ":");
        for(int i=1; i<=tableSize; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    
    }
}
