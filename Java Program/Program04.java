/*  create class Number with only one private instance variable as a double 
primitive type. To include the following methods (include respective 
constructors) isZero(), isPositive(), isNegative( ), isOdd( ), isEven( ), the above
methods return boolean type and getFactorial(), the above method returns
double type.*/

import java.util.Scanner;

class  Number {
    private double value; 

    Number(int x){
        value = x;
    }

    boolean isZero(){
        return value == 0;
    }

    boolean isPositive(){
        return value > 0;
    }

    boolean isNegative(){
        return value < 0;
    }
    
    boolean isOdd(){
        return (value % 2 != 0);
    }

    boolean isEven(){
        return (value % 2 ==0);
    }

    double getFactorial(){
        int fact = 1;
        for(int i=(int)value;i> 0;i--){
            fact*=i;
        }
        return fact;
    }
}


public class Program04 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Value : ");
        int value = s.nextInt();
        Number n1 = new Number(value);

        if (n1.isZero()) {
            System.out.println("Value is Zero");
        }else{
            System.out.println("Value is Not Zero");
        }
        if (n1.isPositive()) {
            System.out.println("Value is positive");
        }else{
            System.out.println("Value is Not positive");
        }
        
        if (n1.isNegative()) {
            System.out.println("Value is negative");
        }else{
            System.out.println("Value is Not negative");
        }

        if (n1.isEven()) {
            System.out.println("Value is even");
        }else{
            System.out.println("Value is Not even");
        }

        if (n1.isOdd()) {
            System.out.println("Value is odd");
        }else{
            System.out.println("Value is Not odd");
        }


        double factValue = n1.getFactorial();
        System.out.println("Factorial is : "+factValue);
       
        
    }
}
