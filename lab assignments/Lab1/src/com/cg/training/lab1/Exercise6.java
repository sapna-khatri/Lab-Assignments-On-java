package com.cg.training.lab1;

import java.util.Scanner;
public class Exercise6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int n= sc.nextInt();
		
		long diff=calculateDifference(n);
		System.out.println("Difference is "+ diff);
		

	}
	
	public static long calculateDifference(int n) {
		long sum=0;
		long s1=0,s2=0;
		
		for(int i=1;i<=n;i++) {
			s1+=i*i;
			s2+=i;
		}
		long s3=s2*s2;
		sum=s1-s3;
		
		return sum;
	}

}
