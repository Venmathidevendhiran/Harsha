package com.chainsys.day3;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		int age;
		String citizenship = "Indian";
		System.out.println("Enter your age");
		Scanner sc = new Scanner(System.in);
		int userAge = sc.nextInt();
		if (userAge > 18) {
			System.out.println("Enter your Nationality");
			String nationality = sc.next();

			if (nationality.equals("Indian")) {
				System.out.println("Enter your state");
				String state = sc.next();
				if (state.equals("Tamilnadu") || (state.equals("pondy"))) {
					System.out.println("user is eligible");
				} else if (state.equals("Andhra")) {
					System.out.println("No elections");
				} else {
					System.out.println("Not Eligible");
				}

			}

		}

	}

	// TODO Auto-generated method stub

}
