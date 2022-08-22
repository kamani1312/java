import java.util.Scanner;
class Prime
{
	public static void main(String args[])
	{
		int n,count=0;
		Scanner aa=new Scanner(System.in);
		System.out.println("enter the number");
		n=aa.nextInt();
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count=1;
				break;
			}
		}
		if(n==1)
		{
			System.out.println("1 is neither prime nor composite");
		}
		else
		{
			if(count==0)
			{
				System.out.println("number is prime");
			}
			else
			{
				System.out.println("number is not prime");	
			}
		}
	}
}    