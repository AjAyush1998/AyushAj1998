import java.util.Scanner;
class Passw
{
  static int PL=8;
  public static void main( String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Password rules:");
    System.out.println("A password must have at least ten characters.");
    System.out.println("A password consists of only letters and digits.");
    System.out.println("A password must contain at least two digits.");
    System.out.println("Input a password (You are agreeing to the above Terms and Conditions.):");
    String passw=sc.nextLine();

    if(pValid(passw))
    {
      System.out.println("Password is valid: "+passw);
    }
    else
    {
      System.out.println("Not a valid password, Try again!");
    }
  }

  public static boolean pValid(String passwo)
  {
    int a=passwo.length();
    if(a < PL)
      return false;
      int cCnt=0;
      int nCnt=0;
      for (int i=0;i<a;i++)
      {
        char ch=passwo.charAt(i);
        if(isNum(ch))
          nCnt++;
        else if (isCh(ch))
          cCnt++;
        else return false;
      }
      return (nCnt>=2 && cCnt>=1);
    }
    public static boolean isNum(char ch)
    {
    return(ch>='0' && ch<='9');
    }
    public static boolean isCh(char ch)
    {
    ch=Character.toUpperCase(ch);
    return(ch>='A' && ch<='Z');
    }
}
