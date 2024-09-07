import java.util.Scanner;
import java.lang.Math;

interface Shape{
    double area();
    double perimeter();
}


class Rectangle implements Shape{
    double length,width;

    Rectangle(){        
        this.length = 2.5;
        this.width = 2.7;
    }

    Rectangle(double dimension1,double dimension2){
        this.length = dimension1;
        this.width = dimension2;
    }

    public double area(){
        return this.length * this.width;
    }

    public double perimeter(){
        return 2 * (this.length+this.width);
    }
}

class Triangle implements Shape{
    double side1,side2,side3;

    Triangle(){
        this.side1 = 4;
        this.side2 = 3;
        this.side3 = 5;
    }

    Triangle(double side1,double side2,double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double area(){
        return this.side1*this.side2*this.side3;
    }

    public double perimeter(){
        return this.side1+this.side2+this.side3;
    }
}

class Circel implements Shape{
    double radius;
    Circel(){
        this.radius = 2.5;
    }

    Circel(double radius){
        this.radius = radius;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }

    public double perimeter(){
        return 2*Math.PI*this.radius;
    }
}

public class Program10 {
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5,5);
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(5,6,5);
        Circelx c1 = new Circelx();
        Circelx c2 = new Circelx(5.6);
        int choice;


        while (true) {
            System.out.println("\n1:Find Area and Perimeter of Rectangle:");
            System.out.println("2:Find Area and Perimeter of Triangle:");
            System.out.println("3:Find Area and circumference of Circle:");
            System.out.println("4:exit");
            System.out.print("Enetr your choice - ");  
            choice = takeInput.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    System.out.println("Detail of Rectangle");
                    System.out.println("Default constructor  - ");
                    System.out.println("Area of Rectangle : "+ r1.area());
                    System.out.println("Perimeter of Rectangle : "+ r1.perimeter());
                    System.out.println("Parameterized Value - ");
                    System.out.println("Area of Rectangle : "+ r2.area());
                    System.out.println("Perimeter of Rectangle : "+ r2.perimeter());
                    break;
                case 2:
                    System.out.println("Detail of Triangle");
                    System.out.println("Default constructor  - ");
                    System.out.println("Area of Triangle : "+ t1.area());
                    System.out.println("Perimeter of Triangle : "+ t1.perimeter());
                    System.out.println("Parameterized Value - ");
                    System.out.println("Area of Triangle : "+ t2.area());
                    System.out.println("Perimeter of Triangle : "+ t2.perimeter());
                    break;
                case 3:
                    System.out.println("Detail of Circle");
                    System.out.println("Default constructor  - ");
                    System.out.println("Area of Circle : "+ c1.area());
                    System.out.println("circumference of Circle : "+ c1.perimeter());
                    System.out.println("Parameterized Value - ");
                    System.out.println("Area of Circle : "+ c2.area());
                    System.out.println("circumference of Circle : "+ c2.perimeter());
                    break;

                case 4:
                    System.exit(1);
            
                default:
                System.out.println("Enter valid choice");
                    break;
            }
        }
    }
}