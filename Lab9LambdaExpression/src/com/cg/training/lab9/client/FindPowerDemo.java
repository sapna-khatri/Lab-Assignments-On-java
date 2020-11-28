package com.cg.training.lab9.client;

import com.cg.training.lab9.service.FindPower;


import java.lang.Math;
import java.util.Scanner;

public class FindPowerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number num1 and num2");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
	
		FindPower finder = (num1,num2)-> (Math.pow(num1,num2));
		System.out.println(finder.findPower(n1, n2));
		
		//findPower(n1,n2);
		
	}

	//public void FindPower(int n1,int n2){
//}

	

}
