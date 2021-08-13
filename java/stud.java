import java.util.*;
import java.util.Scanner;
public class stud{
	static String toppername="unknown";
	static double toppermarks=0;
	String []  name= new String[10];
	double [] marks= new double[5];
	double total;
	stud(String name, double [] mark)
	{
		this.name=name;
		this.marks=mark;
	}
	void total()
	{
		double totalmarks=0;
		for(int i=0;i<5;i++)
		{
			totalmarks+=marks[i];
		}
		this.total=totalmarks;
	}
	
	void checktopper()
	{
		if(this.total>toppermarks)
		{
			toppermarks=this.total;
			toppername=this.name;
		}
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Students name and marks.");
		for(int i=0; i<10; i++)
		{
			System.out.println("Name: ");
			name[i]=sc.nextLine();
			for(int j=0;j<5;j++)
			{
				System.out.println("Marks:");
				marks[j]=sc.nextDouble();
			}
			stud obj=new obj(name,marks);
		}
}}