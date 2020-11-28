package com.cg.training.lab9.client;

import com.cg.training.lab9.service.MyInterface;

public class Exercise4 {  
    public void myMethod(){  
	System.out.println("Instance Method");  
    }  
    public static void main(String[] args) {  
	Exercise4 obj = new Exercise4();   
	// Method reference using the object of the class
	MyInterface ref = obj::myMethod;  
	// Calling the method of functional interface  
	ref.display();  
    }  
}