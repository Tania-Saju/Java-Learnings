package edu.jspiders.test.classes;

import java.util.Scanner;

/*
 * Check Whether a given number is a stepping number or not
 * 
 * Note: A Stepping number is a number in which the difference between the adjacent digits is one.
 * eg: 123
 * (4 Marks)
 * */

public class Question5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = sc.nextInt();

		if (checkStepping(num))
			System.out.println("The Given number is a Stepping number");
		else
			System.out.println("The Given number is not a Stepping number");
	}

	public static boolean checkStepping(int num) {

		int n = num;
		while (num > 0) {
			num = num % 10;
			n = n / 10;
			n = n % 10;
			if (num - n == 1) {
				return true;
			}

		}
		return false;
	}

}
