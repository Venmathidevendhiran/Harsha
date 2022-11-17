package com.chainsys.day3;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		long accountNumber;
		int aadharNumber =45679 ,transactionPin =1245 ,password =9876;
		System.out.println("Enter account holder name");
		Scanner sc =new Scanner(System.in);
		String accountHolderName =sc.next();
		if(accountHolderName.trim() !=null&&(accountHolderName.length()>3)) {
			System.out.println("Enter account number");
			accountNumber =sc.nextLong();
			System.out.println("Enter aadhar number");
			aadharNumber =sc.nextInt();
			if(aadharNumber ==45679) {
				System.out.println("Enter transcation pin and password");
				transactionPin =sc.nextInt();
				password  = sc.nextInt();
				if((transactionPin == 1234) &&(password ==9876))
				{
					System.out.println("Successful Transaction");
				}
				else 
				{
					System.out.println("Invalid credentials");
				}
			}
			else 
			{
				System.out.println("Invalid Aadhar details");
			}
			
					
				}
				
					
					
				}
				
				
			
				
	
			
			
			
		
		// TODO Auto-generated method stub

	}


