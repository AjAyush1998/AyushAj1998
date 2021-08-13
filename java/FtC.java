import java.util.Scanner;
class FtC
{
	public static void main(String s[]){
		double f,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Temperature in Fahrenheit:");
		f=sc.nextDouble();
		c=(((f-32)*5)/9);
		System.out.println("Celsius temperature:"+c);
}
}
