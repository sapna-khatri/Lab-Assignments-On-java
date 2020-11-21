package com.cg.training.lab1;

import java.util.Scanner;

public class Exercise5{

    

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        long sum=calculateSum(n);
        System.out.println("Sum = "+sum);
     }
     
     private static long calculateSum(int n){
         long sum=0;
         for(int i=1;i<=1;i++){
             if(i%3==0 || i%5==0){
                 sum+=i;
             }
         }
         return sum;
     }
}