// create an abstract class named Shape that contains two integers and abstract methods named area() and perimeter(). Provide three classes named Rectangle, Triangle and Circle such that each one of the classes extends the class
// 1) public double area() that calculate and return area of the given shape. And 
// 2) public double perimeter() that calculates and returns circumference/perimeter 
// of the given shape.

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

class Circel extends Shape{
    Circel(){
        super(2.5,0);
    }

    Circel(double dimension){
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
        
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5,5);
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(5,6,5);
        Circel c1 = new Circel();
        Circel c2 = new Circel(5.6);

       

    }
    
}
