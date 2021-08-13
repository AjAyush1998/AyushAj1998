import java.util.Scanner;
class NoMatchException extends Exception
{
  public NoMatchException()
  {
    super("Not from India Exception");
  }
}
class NME
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    try
    {
        System.out.println("Enter Country Name:");
        String x=sc.nextLine();
        if(!x.equals("India"))
      {
        throw new NoMatchException();
      }

      System.out.println("Your Country is India!");
    }
    catch(NoMatchException q)
      {
        System.out.println("NoMatchException "+q);
      }
  }
}
