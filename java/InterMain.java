import java.util.Scanner;
interface RegularPolygon
{
	abstract int getNumSides();
	abstract double getSideLength();
}

class EquilateralTriangle implements RegularPolygon
{
	double side;
	EquilateralTriangle(double side)
	{
		this.side=side;
	}
	public int getNumSide()
	{
		return 3;
	}
	public double getSideLength()
	{
		return this.side;
	}
	public double getPerimeter()
	{
		return 3.0*side;
	}
	public double getInteriorAngle()
	{
		return ((3.0-2.0)*3.14)/3.0;
	}
}
class Square implements RegularPolygon
{
	double sqsi;
	Square(double sqsi)
	{
		this.sqsi=sqsi;
		return sqsi;
	}
	public int getNumSide()
	{
		return 4;
	}
	public double getSideLength()
	{
		Square();
	}
}
class InterMain
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		EquilateralTriangle eq= new EquilateralTriangle();
		Square sq=new Square();
		RegularPolygon re;
		re =eq;
		System.out.println("EQ");
		System.out.println("Side: "+re.getNumSide);
		System.out.println("Side Length: "+re.getSideLength);
		re=sq;
		System.out.println("SQ");
		System.out.println("Side: "+re.getNumSide);
		System.out.println("Side Length: "+re.getSideLength);
	}
}