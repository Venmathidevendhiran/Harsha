package com.chainsys.day3;

import java.util.Scanner;

public class square {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter thelength");
		int length=sc.nextInt();
		System.out.println("Enter breadth");
		int breadth =sc.nextInt();
		
		if(length==breadth) {
			System.out.println("It is square");
		}
		else if(length!=breadth) {
			System.out.println("It is not  a square");
		}
		}
			

		
		// TODO Auto-generated method stub

	}


