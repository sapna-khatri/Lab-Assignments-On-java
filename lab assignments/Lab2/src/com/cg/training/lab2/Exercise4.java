package com.cg.training.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4{
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		int modifiedArray[]=modifyArray(arr);
		for(int i =modifiedArray.length-1;i>=0;i--) {
			System.out.println(modifiedArray[i]);
		}
	}

	private static int[] modifyArray(int[] arr) {
		int n=arr.length;
		for (int i = 0; i < n; i++) 
        {
            for (int j = i+1; j < n; j++)
            {                 
                if(arr[i] == arr[j])
                {
                    arr[j] = arr[n-1];
                    n--;                     
                    j--;
                }
            }
        }
	        int[] array1 = Arrays.copyOf(arr,n);
	        		
		return array1;
     }
	
	}
