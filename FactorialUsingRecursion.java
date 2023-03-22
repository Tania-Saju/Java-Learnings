
package edu.jspiders.programmingmock_1.test1;

import java.util.Scanner;

public class FactorialUsingRecursion 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		
		int num = sc.nextInt();
		
		findFactorial(num);
		
	}
	
	public static void findFactorial(int num)
	{
		// WAP to find the factorial of a given Number using Recursion.
		
		/*
		 * Marks : 3
		 */
		// Write your logic below.........
		
		int fact=1;
		int temp=num;
		while(num>1)
		{
			fact = fact*num;
			num--;
		}

		System.out.println("Factorial of "+temp+" is "+fact);
		
	}

}



