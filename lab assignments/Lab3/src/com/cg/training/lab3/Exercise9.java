package com.cg.training.lab3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Exercise9{

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a date");
		System.out.println("Enter year");
		int y=sc.nextInt();
		System.out.println("Enter month");
		int m=sc.nextInt();
		System.out.println("Enter date");		
		int d=sc.nextInt();
		
		LocalDate end = LocalDate.now();
		LocalDate date= LocalDate.of(y,m,d);
        Period elapsed= date.until(end);
        System.out.println("Days:"+ elapsed.getDays());
        System.out.println("Months:"+elapsed.getMonths());
        System.out.println("Years:"+ elapsed.getYears());
        
	}

}
