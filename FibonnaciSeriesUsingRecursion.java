package edu.jspiders.programmingmock_1.test1;

import java.util.Scanner;

public class FibonnaciSeriesUsingRecursion 
{
   public static void main(String[] args) 
   {
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter the length of the series : ");
	   
	   int l = sc.nextInt();
	   
	   fibonacci(l);
	
   }
   
   public static void fibonacci(int l)
   {
	   //WAP to print the Fibonacci Series Using Recursion.
	   /*
	    * Fibonacci Series :   0 1 1 2 3 5 .................
	    * 
	    * Marks : 4
	    */
	  //  write your logic below ...............
	   int n1=0,n2=1;
	   
	   if(l==1)
	   {
		    System.out.println(" 0");
	   }
	   else if(l==2)
	   {
		    System.out.println( n1+" "+n2+ " ");
	   }
	   else
	   {

	   System.out.print(n1+" "+n2+ " ");
	   for(int i=3;i<=l;i++)
		   {int n3=n1+n2;
		   System.out.print(n3+ " ");
		   n1=n2;
		   n2=n3;
		   }
   }

}
}