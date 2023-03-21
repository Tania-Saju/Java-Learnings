import java.util.Scanner;
class question1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int n=num;int big=0;
		
		for(int i=1;i<=num;i++)
		{
		
			int rem= num%10;

			if(rem>big)
			big=rem;
			num=num/10;
		}
		System.out.println("biggest odd  number = "+big);
}	
}