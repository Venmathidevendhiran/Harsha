package com.chainsys.day3;

import java.util.Scanner;

public class AtmTransction {

	public static void main(String[] args) {
		System.out.println("welcome to yyy account");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your account number");
		long AccountNumber=sc.nextLong();
		System.out.println("Enter your phone number");
		long PhoneNumber =sc.nextLong();
		System.out.println("Enter your pin");
		int pin=sc.nextInt();
		if((pin==4321)||(PhoneNumber==9876543210l))
		{
			System.out.println("Enter widhdraw amount");
			int amount=sc.nextInt();
			System.out.println("Successfully widthdraw");
		}
		else
		{
			System.out.println("pin not valid");
		}
		
		}


	
		
		
		// TODO Auto-generated method stub

	}


