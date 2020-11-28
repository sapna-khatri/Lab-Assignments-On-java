package com.cg.training.lab8.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise92 {

	public static void main(String[] args) {
		ExecutorService service= 
				Executors.newSingleThreadExecutor();
		service.execute(new Runnable() {

			@Override
			public void run() {
			
				System.out.println(Thread.currentThread()); 
			    
	    		try {
	    			FileReader fileread = new FileReader("F:\\Lab Assignment\\source.txt");
	    			BufferedReader bufferread = new BufferedReader(fileread );
	    			FileWriter filewrite = new FileWriter("F:\\Lab Assignment\\target.txt", true);
	    			int s;
	     
	    			while ((s = bufferread.read()) != -1) { 
	    			
	                    if(s%10==0)
	                	{
	                		System.out.println("10 characters copied");
	                		try {
								Thread.sleep(100*50);
							} catch (InterruptedException e) {
								
								e.printStackTrace();
							}
	                	}
	                    filewrite.write(s); 
	    			
	    			}
	    			bufferread.close();
	    			filewrite.close();
	                          
	    		} catch (IOException e) {
	    			
	    			e.printStackTrace();
	    		}
				
			}
		});
		service.shutdown();
		}
}
