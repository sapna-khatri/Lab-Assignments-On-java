package com.cg.training.lab3;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		Scanner sc  =new Scanner(System.in);
		System.out.println("Enter a string");
		String s1=  sc.nextLine();
		
		String s3 =getImage(s1);
		
		System.out.println("Mirror image of string");
		System.out.println(s1+"|"+s3);
		

	}

	private static String getImage(String s1) {
		StringBuffer sb =new StringBuffer(s1);
		StringBuffer s2= sb.reverse();
		String s4=s2.toString();
		
		
		return s4;
	}

}
