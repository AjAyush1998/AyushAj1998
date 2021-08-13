import java.io.IOException;
import java.util.Scanner;

class StudentMain
{
    public static void main(String args[])throws IOException
    {
        int n=3,ch,age;
        String name, address;
        Student[] st = new Student[n];
        Scanner sc = new Scanner(System.in);
        for(int i= 0;i<n;i++)
        {
            st[i]= new Student();
            while(true)
            {
                System.out.println("1) Give only Name,Age\n2) Give Name ,Age and Address");
                System.out.print("Enter choice :");
                ch=Integer.parseInt(sc.nextLine());
                if(ch!=1 && ch!=2)
                {
                    System.out.println("Wrong chpice!!!\nEnter again");
                }
                else
                {
                    break;
                }
            }
            System.out.print("Enter Name : ");
            name= sc.nextLine();
            System.out.print("Enter Age : ");
            age=Integer.parseInt(sc.nextLine());
            if(ch==1)
            {
                st[i].setinfo(name, age);
            }
            else
            {
                System.out.print("Enter Address : ");
                address=sc.nextLine();
                st[i].setinfo(name, age, address);
            }
        }
        for(int i=0;i<n;i++)
        {
            st[i].display();
        }
        sc.close();
    }
}

class Student {
    String name, address;
    int age;
    Student()
    {
        this.name = "unknown";
        this.age = 0;
        this.address = "not available";
    }

    void setinfo(String name, int age)
    {
        this.name=name;
        this.age= age;
    }
    void setinfo(String name, int age , String address)
    {
        this.name=name;
        this.age= age;
        this.address = address;
    }
    void display()
    {
        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);
        System.out.println("Address : " + address);
        System.out.println();
    }
}