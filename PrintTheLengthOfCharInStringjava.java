import java.util.Scanner;
class question2
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		int leng=sc.nextInt();
		printseq(1,1,leng,1);
	}
public static void printseq(int ch1,int ch2,int leng ,int i)
{
	if(i<=leng)
	{
		if(i%2!=0)
		{
		System.out.println(ch1++);
		}
		else
		{
		System.out.println(ch2=ch2+2);
		}
		printseq(ch1,ch2,leng,i+1);
	}
	
	
}	
}
