import java.util.Scanner;
class Employee
{
	String name,address;
	int age=0 ;
	
	Employee(String name, String address, int age)
	{
		this.age=age;
		this.address=address;
		this.name=name;
	}
}
class Manager extends Employee
{
	String Dept;
	double Salary;
	Manager(String name, String address, int age, String Dept)
	{
		super(name,address, age);
		this.Dept=Dept;
	}
	
	double getSal()
	{if((this.Dept).equals("Sales"))
		return 50000.0;
	else if((this.Dept).equals("HR"))
		return 80000.0;
	else if((this.Dept).equals("IT"))
		return 100000.0;
	else if((this.Dept).equals("R&D"))
		return 120000.0;
	else return 0.0;
	}
	
	String getName()
	{
		return Dept +" Manager "+ name;
	}
}
class Worker extends Employee
{
	int ndw;
	double dw,ts;
	Worker(String name, String address, int age)
	{
		super(name,address,age);
		this.ndw=28;
		this.dw=age>45? 500:400;
	}

	double getSal()
	{
		return this.dw*ndw;
	}

	String getName()
	{
		return "Worker "+name;
	}
}

class E1
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		String n="",d="";
		System.out.println("Enter Manager's name:");
		n=sc.nextLine();
		System.out.println("Department:  Sales    HR    IT     R&D");
		System.out.println("Enter Department:");
		d=sc.nextLine();
		System.out.println("Enter Age:");
		int a=sc.nextInt();
		Manager m=new Manager(n,"Kolkata",a,d);
		System.out.println(m.getName()+" gets a pay of INR "+ m.getSal());
		String wn="",wd="";
		System.out.println("Enter Worker's name :");
		wn=sc.nextLine();
		System.out.println("Enter Department:");
		wd=sc.nextLine();
		Worker w=new Worker(wn,wd,25);
		System.out.println(w.getName()+" get a pay of INR "+w.getSal());
	}
}