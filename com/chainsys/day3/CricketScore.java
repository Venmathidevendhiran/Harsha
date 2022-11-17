package com.chainsys.day3;

import java.util.Scanner;

public class CricketScore {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String  teamA, teamB;
		int  TargetScore=60;

		
		System.out.println("Enter teamName");
		TargetScore=sc.nextInt();
		
		teamA=sc.next();
		teamB=sc.next();
		System.out.println("Enter TargetScore");
		if(TargetScore>60) {
			System.out.println("Score A is winning");
			
		}
		else if(TargetScore<60) {
			System.out.println("Score B is   Winning");
		}
		
		
		
		
			
		}
		
				
		// TODO Auto-generated method stub

	}


