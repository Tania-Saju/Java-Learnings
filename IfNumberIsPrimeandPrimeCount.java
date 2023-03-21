import java.util.Scanner;
class question3
{
	public static void main(String[] args)
	{
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number ");
		int num = sc.nextInt();
		int n=num;
		prime(num,count,2);
		if(count == 0)

			System.out.println("no is prime");
		else
			
			System.out.println("no is not prime");
	}

public static void prime(int num,int count,int i)
{
		
		if(i<=num/2)
		{
			if(num%i ==0)
			count++;
			
		}
		prime(num,count,i+1);
}
	
}	
	

