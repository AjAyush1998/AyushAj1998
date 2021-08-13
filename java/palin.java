import java.util.Scanner;
class palin
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a palindromic number:");
		int p=sc.nextInt();
		int c=p,n=0,s=0;
		while(p>0)
		{
			n=p%10;
			s=s*10+n;
			p=p/10;
		}
		if(s==c)
		System.out.println("The Number "+s+" is palindromic!");
		else
		System.out.println("Enter a correct Number");
	}
}