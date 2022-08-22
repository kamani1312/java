import java.util.Scanner;
class reverse
{
	public static void main(String[] args)
	{
		int n,r=0,rem;
		Scanner rr=new Scanner(System.in);
		System.out.println("enter number:-");
		n=rr.nextInt();
		while(n!=0)
		{
			rem=n%10;
			r=r*10+rem;
			n=n/10;
		}
			System.out.println("reversed number is=" +r);
	}
}		