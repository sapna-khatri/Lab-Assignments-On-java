package com.cg.training.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of objects ");
		int size = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the string objects");
		String str[]=new String[size];
		for(int i=0;i<size;i++) {
			
			str[i]=sc.nextLine();
		}
		int l1=0;
			
		int l = str.length;
		String[] s=sortStrings(str);
		if(l%2!=0) {
			l1=(l/2)+1;
			//l2=l-l1;
		}
		  
		else {
			l1=l/2;
			//l2=l-l1;
		}
		
		for(int  i=0;i<l;i++) {
			if(i<l1) {
				System.out.println(s[i].toUpperCase()+" ");
			}
			else {
				System.out.println(s[i].toLowerCase()+" ");	
			}
				
		}
	}

	private static String[] sortStrings(String[] str) {
	
		Arrays.sort(str);
		
		return str;
	}

}
