package com.chainsys.day3;

import java.util.Scanner;

public class StudentAttendance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float percentage =7.5f;
		System.out.println("Enter the number of class to be held");
		percentage=sc.nextFloat();
		System.out.println("Enter attend the number of class");
		percentage=sc.nextFloat();
		if(percentage<75) {
			System.out.println("eligible");
		}
		
	else if (percentage>75) {
			System.out.println("not eligible");
		}
			
			
			
		}
}
		
		
		// TODO Auto-generated method stub

	


