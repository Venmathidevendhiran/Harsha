package com.chainsys.day3;

import java.util.Scanner;

public class CalculatorDesign {

	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
		 int a,b,c,e;
		 char op;
		 System.out.println("Enter a and b number");
		 a =sc.nextInt();
		 b =sc.nextInt();
		  c=sc.nextInt();
		 System.out.println("Enter the type of operator(+,-,*,/,%)-");
		 op =sc.next().charAt(0);
	
		if(op == '-') {
			e=a-b-c;
			System.out.println(e);
		}
		else if(op  == '+') {
			e=a+b+c;
			System.out.println(e);
		}
		else if(op == '*') {
			e=a*b*c;
			System.out.println(e);
			
		}
		else if(op== '%');
		e=a%b%c;
		System.out.println(e);
	}


			
		
		
	
		// TODO Auto-generated method stub

	}


