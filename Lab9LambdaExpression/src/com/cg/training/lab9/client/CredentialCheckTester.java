package com.cg.training.lab9.client;

import java.util.function.BiConsumer;
import com.cg.training.lab9.service.*;
import java.util.function.BiPredicate;
import java.util.function.Consumer;



public class CredentialCheckTester {

	public static void main(String[] args) {
		CredentialCheck check= (userid,password)->{
			if(userid.equals("admin") && 
					password.equals("admin@123")) {
				return true;
			}
			return false;
		};

		System.out.println(check.test("admin", "admin"));

		//Make use of BiPredicate which is a built-in functional interface

		BiPredicate<String,String> biPredicate =
				(userid,password)->{

					if(userid.equals("admin") && 
							password.equals("admin@123")) {
						return true;
					}
					return false;

				};

		System.out.println(biPredicate.test("admin", "admin@123"));
		
		
		Consumer<String> consumer1= (String string)->System.out.println(string);
		consumer1.accept("Hello!!");
		Consumer<String> consumer2= System.out::println;
		consumer2.accept("Hi!");
		
		

	}

}
