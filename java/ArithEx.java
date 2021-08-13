import java.util.Scanner;
class ArithEx
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a,b,div;
    System.out.println("Enter 1st number:");
    a=sc.nextInt();
    System.out.println("Enter 2nd number");
    b=sc.nextInt();
          try{
            div=a/b;
            System.out.println(a+" / "+b+" = "+div);
            }
          catch(ArithmeticException e){
            System.out.println("Division by 0 is not allowed!");
          }
  }//end of main()
}//end of class
