package com.cg.training.lab8.service;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise91 {

	public static void main(String[] args) {
		ExecutorService service= 
				Executors.newSingleThreadExecutor();
		service.execute(new Runnable() {

			@Override
			public void run() {
				
				for(int i=0;i<100;i++) {
					 try {
							Thread.sleep(100*100);
							 System.out.println(Thread.currentThread().getName()+" starts at :"+LocalDateTime.now());
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
			                    
			        }
				
			}
			
		});
		
		service.shutdown();
		

	}

}
