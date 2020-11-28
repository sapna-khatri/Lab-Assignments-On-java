package com.cg.training.lab6.server;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Exercise3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		Map<Integer,Long> hashMap=getSquares(arr);
		for(Map.Entry<Integer,Long> e : hashMap.entrySet()) {
            System.out.println(e.getKey()+":"+e.getValue());
        }
	}

	private static Map<Integer,Long> getSquares(int[] arr) {
		Map<Integer,Long> hashMap = new HashMap<>();
		for(int i=0;i<arr.length;i++)
		hashMap.put(arr[i],(long) (arr[i]*arr[i]));
		
		
		return hashMap;
	}
}
