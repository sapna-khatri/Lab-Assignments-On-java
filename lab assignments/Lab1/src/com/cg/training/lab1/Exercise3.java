package com.cg.training.lab1;
import java.util.Scanner;
public class Exercise3
{

  
    static int fib(int n) 
    { 
        if (n <= 1) 
            return n; 
        return fib(n - 1) + fib(n - 2); 
    } 
    
    static int fib2(int n) 
    { 
    
    int f[] = new int[n+2]; 
    int i; 
       
    f[0] = 0; 
    f[1] = 1; 
      
    for (i = 2; i <= n; i++) 
    { 
       
        f[i] = f[i-1] + f[i-2]; 
    } 
       
    return f[n]; 
    } 
  
    public static void main(String args[]) 
    { 
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the values of nth term");
        int n = sc.nextInt(); 
        System.out.println(fib(n)); 
         System.out.println(fib2(n)); 
    } 
} 
