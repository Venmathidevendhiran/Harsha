package com.chainsys.day3;

import java.util.Scanner;

public class Medicalcause {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	
		System.out.println("do you have a mediacl cause");
        String medicalcause=sc.nextLine();
        if(medicalcause.equals("yes")) {
        	System.out.println("allow student to sit");
        }
        else if(medicalcause.equals("no")) {
        		System.out.println("Dont allow to sit");
        }
        		
        		
        
				
		
		
		
		// TODO Auto-generated method stub

	}

}
