package edu.jspiders.programmingmock_1.test1;

import java.util.Scanner;

public class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		
		int num = sc.nextInt();
		
		checkPalindrome(num);
		
	}
	
	public static void checkPalindrome(int num)
	{
		
		/* WAP to check if the number is palindrome or not.
		 * A number is called palindrome if the number and its reverse is equal.
		 * eg:- 121
		 * 
		 * Marks : 2
		 */
		
		// Write your logic below..............
		int rev=0,rem;
		int temp=num;
		while(num>0)
		{
		rem = num%10;
		rev=rev*10+rem;
		num=num/10;
		}
		if(temp==rev)
		{System.out.println(" palindrome");
			
		}else
		{
		System.out.println("not palindrome");
		}
	}

}
