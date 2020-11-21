package com.cg.training.lab2;



import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter a array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		int s= getSecondSmallest(arr);
		
		
		System.out.println("Second smallest element is "+ s );
	}
	
	public static int getSecondSmallest(int arr[]) {
		int ss=0;
		Arrays.sort(arr);
		ss=arr[1];
		return ss;
	}

}
