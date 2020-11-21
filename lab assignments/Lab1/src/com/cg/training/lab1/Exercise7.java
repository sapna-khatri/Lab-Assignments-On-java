package com.cg.training.lab1;

import java.util.Scanner;
public class Exercise7 {

	public static void main(String[] args) {
		
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter a number");
	 int n=sc.nextInt();
	 
	 if(checknumber(n)) {
		 System.out.println("Number is increasing");
	 }
	 else {
		 System.out.println("Number is not increasing");
	 }
	 

	}
	
	public static boolean checknumber(int n) {
		String check =String.valueOf((n));
		int length=check.length();
		for(int i=0;i<length-1;i++) {
			if(check.charAt(i)<= check.charAt(i+1)) {
				continue;
			}
			else {
				return false;
			}
		}
		return true;
		
		
	}

}
