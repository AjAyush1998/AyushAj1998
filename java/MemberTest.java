import java.util.Scanner;
import java.io.IOException;
class Member
{
  String name;
  int age;
  String phone_number;
  String address;
  int salary;

  public void printAge(){
    System.out.println(age);
  }
  public void printSalary(){
    System.out.println(salary);
  }
}

class Employee extends Member
{
  String specialization;
  void display()
  {
    System.out.println("----Employee's Details---");
    System.out.println("Name : "+ name);
    System.out.println("Age : "+ age);
    System.out.println("Phone Number: "+phone_number);
    System.out.println("Address : " + address);
    System.out.println("Salary :"+salary);
    System.out.println("Specialization: "+specialization);
    System.out.println("----------");
  }
}

class Manager extends Member
{
  String department;
  void display()
  {
    System.out.println("----Manager's Details---");
    System.out.println("Name : "+ name);
    System.out.println("Age : "+ age);
    System.out.println("Phone Number: "+phone_number);
    System.out.println("Address : " + address);
    System.out.println("Salary :"+salary);
    System.out.println("Department: "+department);
    System.out.println("----------");
  }
}

class MemberTest
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  Employee e=new Employee();
  System.out.println("Enter Employee's Name:");
  String employee_name;
  employee_name=sc.nextLine();
  e.name=employee_name;
  System.out.println("Enter Employee's Age:");
  int employee_age=sc.nextInt();
  e.age=employee_age;
  System.out.println("Enter Employee's Phone Number:");
  e.phone_number=sc.next();
  System.out.println("Enter Employee's address:");
  String e_addr=sc.next();
  e.address=e_addr;
  System.out.println("Enter Employee's Salary:");
  e.salary=sc.nextInt();
  System.out.println("Enter Employee's Specialization:");
  String spec=sc.next();
  e.specialization=spec;
  e.display();

  Manager m =new Manager();
  System.out.println("Enter Manager's Name:");
  String manager_name=sc.next();
  m.name=manager_name;
  System.out.println("Enter Manager's Age:");
  int m_age=sc.nextInt();
  m.age=m_age;
  System.out.println("Enter Manager's Phone Number:");
  m.phone_number=sc.next();
  System.out.println("Enter Manager's address:");
  String m_addr=sc.next();
  m.address=m_addr;
  System.out.println("Enter Manager's Salary:");
  int sal=sc.nextInt();
  m.salary=sal;
  System.out.println("Enter Manager's Department:");
  String dept=sc.next();
  m.department=dept;
  m.display();
  }
}
