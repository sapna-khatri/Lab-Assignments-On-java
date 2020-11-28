package com.cg.training.lab6.server;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size");
		int size=scanner.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elemets");
		for(int i=0;i<size;i++) {
			arr[i]=scanner.nextInt();
		}
		
		int secondSmallest = getSecondSmallest(arr);
		System.out.println("Second Smallest element: "+secondSmallest);
		
	}

	private static int getSecondSmallest(int[] arr) {

		List<Integer> list  =new ArrayList<>();
		for(Integer i : arr) {
			list.add(i);
		}
		
		Collections.sort(list);
		
		int ss = list.get(1);
		return ss;
	}

}
