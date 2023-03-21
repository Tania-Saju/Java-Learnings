package edu.jspiders.test.classes;

import java.util.Scanner;

/*
 * In this program Display the largest Odd Unique 
 * Number in the Array
 * 
 * (3 Marks)
 * */

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the Array");
		int[] arr = new int[sc.nextInt()];

		System.out.println("Enter the Elements of the Array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int largest = FindLargest(arr);

		if (largest == 0)
			System.out.println("Numbe not present");
		else
			System.out.println("Largest Odd unique number = " + largest);
	}

	public static int FindLargest(int[] arr) {
		int lar = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {
				if (arr[i] % 2 != 0 && arr[i] > arr[j])
					lar = arr[i];
			}

		}

		return lar;
	}
}
