import java.util.Scanner;
interface Area
{    
	double pi = 3.14;    
	double calculate(double q,double w);    
}    
    
class Rectangle implements Area
{    
	public double calculate(double x,double y)
	{    
		return(x*y);
	}    
}
    
class Circle implements Area
{
	public double calculate(double r, double z)
	{    
		return(pi*r*r);    
	}
}
   
class InArea
{    
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	Rectangle rect = new Rectangle();
	Circle cir = new Circle();
	Area area;
	area = rect;
	double l,b,r;
	System.out.println("Enter length of the Rectangle:");
	l=sc.nextDouble();
	System.out.println("Enter breadth of the Rectangle:");
	b=sc.nextDouble();
	System.out.println("Enter radius of the Circle:");
	r=sc.nextDouble();
	System.out.println("Area of Rectangle is :" +area.calculate(l,b));
	area = cir;
	System.out.println("Area of Circle is : " +area.calculate(r,r));
	}    
}