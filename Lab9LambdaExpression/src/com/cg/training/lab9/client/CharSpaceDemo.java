package com.cg.training.lab9.client;

import java.util.Scanner;

import com.cg.training.lab9.service.CharSpace;

public class CharSpaceDemo {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();

		CharSpace charSpace =(s1)->{
			String s2="";
				for(int i=0;i<s1.length();i++) {
					s2=s2+s1.charAt(i)+" ";
					//s2=s2+" ";
				}
				return s2;
		};
		
		System.out.println(charSpace.addSpace(str));
	}

}
