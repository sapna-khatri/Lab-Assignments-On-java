package com.cg.training.lab8.service;

import com.cg.training.lab8.client.CopyDataThread;

public class CopyThreadDemo {

		public static void main(String[] args) {
			System.out.println(Thread.currentThread()); 
			Thread t1= new CopyDataThread("worker-1");
			t1.start();
			
			

		}

	
	
}
