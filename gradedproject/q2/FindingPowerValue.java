package com.gradeProject.q2;

import java.util.Scanner;

public class FindingPowerValue {

	public static int power(int m, int n) {

		if (n == 0) {
			return 1;
		}
		int result = m * power(m, n - 1);

		return result;
	}

	public static void main(String[] args) {
		// importing the scanner class for taking input from the user
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the base number X : ");
		int baseNumber = sc.nextInt();

		System.out.println("Enter the power N : ");
		int power = sc.nextInt();
		// Printing the power value
		System.out.println("X power N is :" + power(baseNumber, power));

	}

}
