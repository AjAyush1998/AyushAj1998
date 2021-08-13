import java.util.*;
class avg
{
public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 3 numbers to get its average");
	System.out.println("f1=");
	int f1=sc.nextInt();
	System.out.println("f2=");
	int f2=sc.nextInt();
	System.out.println("f3=");
	int f3=sc.nextInt();
	int a=(f1+f2+f3)/3;
	System.out.println("Average of the 3 numbers="+a);
	}
}