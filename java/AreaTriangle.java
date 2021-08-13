import java.util.Scanner;
public class AreaTriangle {
  public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         System.out.print("Input Side-1: ");
         double s1 = sc.nextDouble();
         System.out.print("Input Side-2: ");
         double s2 = sc.nextDouble();
         System.out.print("Input Side-3: ");
         double s3 = sc.nextDouble();
         if(V(s1, s2,s3))
         {
            System.out.println("The area of the triangle is " + Area(s1, s2, s3));
            }
        else
         System.out.println("Invalid triangle" );
    }

  public static boolean V(double si1, double si2, double si3)
  {
      if( si1 + si2 > si3 && si2 + si3 > si1 && si1 + si3 > si2)
        return true;
        else
        return false;
    }
   public static double Area(double si1, double si2, double si3) {
        double area = 0;
        double s = (si1 + si2 + si3)/2;
        area = Math.sqrt(s*(s - si1)*(s - si2)*(s - si3));
        return area;
    }
}
