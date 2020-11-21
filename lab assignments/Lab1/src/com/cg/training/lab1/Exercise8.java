package com.cg.training.lab1;

import java.util.Scanner;
public class Exercise8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n= sc.nextInt();
		
		boolean b = checkNumber(n);
		if(b) {
			System.out.println(n +" is a power of 2 ");
		}
		else {
			System.out.println(n +" is not a power of 2 ");
		}
	}
	
	private static boolean checkNumber(int n) {
		if(n==0) {
			return false;
		}
		
		while(n!=1) {
			if(n%2!=0) {
				return false;
			}
			n=n/2;
		}
		return true;
		
	}

}
