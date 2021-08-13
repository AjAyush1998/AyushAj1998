import java.util.Scanner;
class ArithEx
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a,b, mul,div,cas;
    switch(cas)
      {
        case 1:
          try{
            mul=a*b;
            System.out.println(a+" * "+b+" = "+mul);
            }
            catch(ArithmeticException e){
              System.out.println("Multiplication with 0 is denied");
              }
        case 2:
          try{
            div=a/b;
            System.out.println(a+" / "+b+" = "+div);
            }
          catch(ArithmeticException e){
            System.out.println("Division by 0 is not allowed!");
          }
      }//end of switch
  }//end of main()
}//end of class
