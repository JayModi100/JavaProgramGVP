
class Circel{
    private double x;
    private double y, r;

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
}

public class Program06 {
    public static void main(String[] args) {
        Circel c1 = new Circel();
        Circel c2 = new Circel(3.5,3.6,2.5);
        Circel c3 = new Circel(c2);

        System.out.println("Circel c1 - ");
        System.out.println("Area: " + c1.area());
        System.out.println("Circumference: " + c1.circumference());
        System.out.println("Diameter: " + c1.diameter());

        System.out.println("Circel c2 - ");
        System.out.println("Area : "+c2.area());
        System.out.println("Ciccumfrence: "+c2.circumference());
        System.out.println("Diameter: "+ c2.diameter());

        System.out.println("Circel c3 - ");
        System.out.println("Area : "+c3.area());
        System.out.println("Ciccumfrence: "+c3.circumference());
        System.out.println("Diameter: "+ c3.diameter());
        
    }
}
