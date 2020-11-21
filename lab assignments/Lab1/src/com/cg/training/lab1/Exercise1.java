package com.cg.training.lab1;

import java.util.Scanner;
public class Exercise1{

    
 public static void main(String args[]){
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number");
	
    int n=0;
	n=sc.nextInt();
	
	sumOfCubes(n);
	
   }

  public static void sumOfCubes(int n){
      int sum=0;
	while(n>0){
    
	 int i=n%10;
	 i=i*i*i;
	 sum+=i;
	 n=n/10;
	}

	System.out.println("Sum of cubes is "+ sum);
   
 }
}
