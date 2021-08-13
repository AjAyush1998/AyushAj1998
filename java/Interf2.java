import java.util.Random; 
import java.util.Scanner;
interface RegularPolygon
{
	int getNumSides();
	double getSideLength();
	default double getPerimeter(int n, double si)
	{
		double pe= n * si;
		return pe;
	}

	default double getInteriorAngle(int n)
	{
		double an = (((n - 2) * 3.14) / n);
		return an;
	}
}

class EquilateralTriangle implements RegularPolygon
{
	double si;
	public EquilateralTriangle(double si)
	{
		this.si = si;
	}

	public int getNumSides()
	{
		return 3;
	}

	public double getSideLength()
	{
		return this.si;
	}
}
class Square implements RegularPolygon
{
	double si;
	public Square(double si)
	{
		this.si = si;
	}

	public int getNumSides()
	{
		return 4;
	}
	public double getSideLength()
	{
		return this.si;
	}
}

public class Interf2
{
	public static double totalSides(RegularPolygon po[]) 
	{
		double sum = 0;
        	for (int i = 0; i < 5; i++)
		{
            		sum = sum + po[i].getSideLength();
        	}
		return sum;
	}
	public static void main(String[] args)
	{
        	RegularPolygon[] po = new RegularPolygon[5];
        	int i;
		Scanner sc = new Scanner(System.in);
        	for (i = 0; i < 5; i++) 
		{
            		System.out.println("Enter side of square " + i);
            		double si = 0;
            		si = sc.nextDouble();
            		po[i] = new Square(si);
        	}

        	for (i = 2; i < 5; i++) 
		{
            		System.out.println("Enter side of Equilateral Triangle " + i);
            		double si = 0;
            		si = sc.nextDouble();
            		po[i] = new EquilateralTriangle(si);
        	}

	        System.out.println("Sum of sides of all polygons: " + totalSides(po));
        	for (i = 0; i < 5; i++) 
		{
            		System.out.println("Interior Angle of polygon " + i + po[i].getInteriorAngle(po[i].getNumSides()));
            		System.out.println("Perimeter of polygon " + i + po[i].getPerimeter(po[i].getNumSides(), po[i].getSideLength()));
        	}
    	}
}