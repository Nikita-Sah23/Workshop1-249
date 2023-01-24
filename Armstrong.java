package com.LogicalProgams;

import java.util.*;

public class Armstrong {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int sum = 0;
		int remainder;
		

		while (number > 0) {
			remainder = number % 10;
			sum = sum + (remainder * remainder * remainder); //3   153= 1+125+27
			number = number / 10;
		}
		if (sum == number) {
			System.out.println("Number is Armstrong");
		} else {
			System.out.println("Number is not Armstrong");
		}
	}

}
