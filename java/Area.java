import java.util.*;
class Area {
    void ar(double l, double b) {
	System.out.println("Area of Rectangle: "+(l*b));
    }
    void ar(double a) {
        System.out.println("Area of Square: "+(a*a));
    }
    public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
        Area o= new Area();
        System.out.println("Enter Side of square:");
	double a=sc.nextDouble();
	System.out.println("Enter length of rectangle:");
	double l=sc.nextDouble();
	System.out.println("Enter breadth of rectangle:");
	double b=sc.nextDouble();
	o.ar(l,b);
	o.ar(a);
    }
}