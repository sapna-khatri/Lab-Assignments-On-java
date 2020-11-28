package com.cg.training.lab6.server;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size");
		int size=scanner.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elemets");
		for(int i=0;i<size;i++) {
			arr[i]=scanner.nextInt();
		}
		
		int arr1[]=getSorted(arr);
		
		System.out.println("After reversing and sorting array elements");
		for(int i=0;i<size;i++) {
			System.out.println(arr1[i]);
		}
		
	}

	private static int[] getSorted(int[] arr) {
		
		String[] s= new String[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			StringBuilder sb =new StringBuilder();
			s[i]=String.valueOf(arr[i]);
			sb.append(s[i]);
			sb=sb.reverse();
			s[i]=sb.toString();
			
			
		}
		int arr2[] = new int[arr.length];
		 
		for(int i=0;i<arr.length;i++) {
			arr2[i]=Integer.parseInt(s[i]);
		}
		
		Arrays.sort(arr2);
		return arr2;
	}

}
