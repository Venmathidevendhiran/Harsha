package com.chainsys.day3;

import java.util.Scanner;

public class purchesCost {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your purchased quantity");
		Double purchasedQuan = sc.nextDouble();

		if (purchasedQuan < 1000)

		{
			System.out.println("Total cost=" + (purchasedQuan - (purchasedQuan / 100 * 10)));
		} else {
			System.out.println("Total cost=" + purchasedQuan);

		}
	}
}

// TODO Auto-generated method stub
