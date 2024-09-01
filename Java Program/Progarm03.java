/**
 * Progarm03
 */
import java.util.Scanner;
 class Utility{
    public static long factorial(long value){
        long temp=1;
        for(int i=1;i<=value;i++){
            temp*=i;
        }
        return temp;
    }

    public static boolean isPrime(int number){
        boolean checker = false;
        int temp = number;
        for(int i=2;i<=number;i++){
            if(number % i == 0){
                if(i == temp){
                    checker = true;
                }
                break;
            }
        }
        return checker;
    }

    public static boolean isEven(long value){
        
        if(value % 2 == 0){
            return true;
        }
        return false;
    }
    public static boolean isOdd(long value) {
        if(value % 2 != 0){
            return true;
        }else{
            return false;
        }
    }
 }

public class Progarm03 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Find the Fectorial 
        System.out.println("==>Find the Factorial ");
        System.out.print("Enter the Number to Find Factorial : ");
        long number = s.nextLong();
        long factorial = Utility.factorial(number);
        System.out.println("Factorial of "+ number + " is : "+factorial);


        // Check the number is prime or not.
        System.out.println("\n\n==> Check the Number is Prime or Not ");
        System.out.print("Enter the Number to validate is prime or not : ");
        int value = s.nextInt();
        boolean prime = Utility.isPrime(value);
        if(prime){
            System.out.println(value +" is Prime number");
        }else{
            System.out.println(value +" is not prime number");
        }

        // Chceck the number is even or not
        System.out.println("\n==>Check the number is even ");
        System.out.print("Enter the number to validate is even or not : ");
        value = s.nextInt();
        boolean even = Utility.isEven(value);
        if(even){
            System.out.println(value + " is even number");
        }else{
            System.out.println(value + " is not even number");
        }

        //Check the number is odd or not
        System.out.println("\n==>Check the number is odd ");
        System.out.print("Enter the number to validate is Odd or not : ");
        value = s.nextInt();
        if(Utility.isOdd(value)){
            System.out.println(value +" is odd number");
        }else{
            System.out.println(value +" is not odd number");

        }

    }
}