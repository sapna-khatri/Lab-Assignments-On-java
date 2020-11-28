package com.cg.training.lab6.server;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter array size");
		int size= scanner.nextInt();
		char arr[] = new char[size];
		System.out.println("Enter character in array");
		for(int i=0;i<size;i++) {
			arr[i]=scanner.next().charAt(0);
		}
		
		Map<Character, Integer> map=countChars(arr);
		
		for(Map.Entry<Character, Integer> e : map.entrySet()) {
            System.out.println(e.getKey()+":"+e.getValue());
        }
	}
	
	public static Map<Character,Integer> countChars(char arr[]){
		
		Map<Character, Integer> hashMap = new HashMap<>();
		
		for (int i = 0; i <arr.length; i++) { 
       
            int find = 0; 
            for (int j = 0; j <= i; j++) { 
  
                 if (arr[i] == arr[j])  
                 find++;                 
            } 
            
            hashMap.put(arr[i], find);
  
	}
		return hashMap;

 }
}

