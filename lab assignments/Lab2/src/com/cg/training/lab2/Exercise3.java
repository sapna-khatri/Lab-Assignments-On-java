package com.cg.training.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		int sortedArray[] = getSorted(arr);
		
		System.out.println("Reversed array ");
		for(int i=0;i<size;i++) {
			System.out.println(sortedArray[i]);
		}
		
		System.out.println("After reversing and sorting array is");
		Arrays.sort(sortedArray);
		for(int i=0;i<size;i++) {
			System.out.println(sortedArray[i]);
		}
		
				

	}
	
	public static int[] getSorted(int arr[]) {
		int n= arr.length;
		int reverseArray[]= new int[n];
	
		 
        int j = n; 
        for (int i = 0; i < n; i++) { 
           reverseArray[j - 1] = arr[i]; 
            j = j - 1; 
        } 
		
		
		return reverseArray;
	}

}
