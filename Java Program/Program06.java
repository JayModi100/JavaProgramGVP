// Create a class “Circle” with 1) private variables x, y, and r
// Here x and y are coordinates of center of circle and r is a radius 
// 2) Define all possible constructors.
// 3) Define a method – public double area() which is calculate and return area of a 
// circle.
// 4) Define a method – public double circumference() which is calculate and return 
// perimeter of a circle.
// 5) Define a method – public double diameter() which is calculate and return 
// diameter of a circle


class Circel{
    private double x;
    private double y;
    private double r;

    Circel(){
        this.x = 2.5;
        this.y = 2.6;
        this.r = 2.7;
    }
    Circel(double x,double y,double r){
        this.x = x;
        this.y = y;
        this.r = r;
    }

    Circel(Circel copy){
        this.x = copy.x;
        this.y = copy.y;
        this.r = copy.r;
    }

    public double area(){
        return Math.PI * r *r;
    }

    public double circumference(){
        return 2 * Math.PI * r;
    }

    public double diameter(){
        return 2*r;
    }

    public void printMethod(){
        System.out.println("\nCircel Details - ");
        System.out.println("Coordinates of center : (" + x +","+y+")");
        System.out.println("Redius : " + r);
        System.out.println("Area: " + area());
        System.out.println("Circumference: " + circumference());
        System.out.println("Diameter: " + diameter());
    }
}

public class Program06 {
    public static void main(String[] args) {
        Circel c1 = new Circel();
        Circel c2 = new Circel(3.5,3.6,2.5);
        Circel c3 = new Circel(c2);


        c1.printMethod();
        c2.printMethod();
        c3.printMethod();
        
    }
}
