// create an abstract class named Shape that contains two integers and abstract methods named area() and perimeter(). Provide three classes named Rectangle, Triangle and Circle such that each one of the classes extends the class
// 1) public double area() that calculate and return area of the given shape. And 
// 2) public double perimeter() that calculates and returns circumference/perimeter 
// of the given shape.

import java.util.Scanner;

abstract class Shape{
    protected double dimension1;
    protected double dimension2;

    Shape(double width,double height){
        this.dimension1 = width;
        this.dimension2 = height;
    }

    abstract public double area();
    abstract public double perimeter();
}

class Rectangle extends Shape{
    Rectangle(){
        super(3.5,4.5);
    }

    Rectangle(double width,double height){
        super(width, height);
    }

    public double area(){
        return dimension1 * dimension2;
    }

    public double perimeter(){
        return 2*(dimension1 + dimension2);
    }
}

class Triangle extends Shape{
    double dimension3;
    Triangle(){
        super(3.5,3.5);
        this.dimension3 = 4;
    }

    Triangle(double dimension1,double dimension2,double dimension3){
        super(dimension1,dimension2);
        this.dimension3 = dimension3;
    }

    public double area(){
        return this.dimension1*this.dimension2*this.dimension3;
    }

    public double perimeter(){
        return this.dimension1+this.dimension2+this.dimension3;
    }
}

class Circelx extends Shape{
    Circelx(){
        super(2.5,0);
    }

    Circelx(double dimension){
        super(dimension,0);
    }

    public double area(){
        return Math.PI * this.dimension1 * this.dimension1;
    }

    public double perimeter(){
        return 2 * Math.PI * this.dimension1;
    }
}


public class Program09 {
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
            System.out.print("Enetr your choice");  
            choice = takeInput.nextInt();
            
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
