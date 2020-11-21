package com.cg.training.lab3;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of integers");
		
		int size= sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
			sum+=arr[i];
		}
		
		System.out.println("Sum is "+sum);
		
		
	}

}
