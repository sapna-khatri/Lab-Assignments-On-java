package com.cg.training.lab3;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n= sc.nextInt();
    
   
    int n2=modifyNumber(n);
    
    System.out.println(n2*10+n%10);
    

	}

	private static int modifyNumber(int n) {
		int diff=0,d=0;
		String s1=Integer.toString(n);
		int c[]=new int[s1.length()];
		for(int i=0;i<s1.length();i++) {
			c[i]=(int)s1.charAt(i);
				
		}
		StringBuffer sb =new StringBuffer();
		int i=0;
		int a=c[c.length-1];
		for(i=0;i<c.length-1;i++) {
			if(c[i]>c[i+1]) {
				d=c[i]-c[i+1];
			}
			else {
				d=c[i+1]-c[i];
			}
			
			
			sb.append(d);
		}
		//sb.append(a);
		diff=Integer.parseInt(sb.toString());
		return diff;
	}

}
