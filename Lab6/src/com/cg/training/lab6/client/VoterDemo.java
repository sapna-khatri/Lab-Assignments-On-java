package com.cg.training.lab6.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.cg.training.lab6.server.Exercise6;

public class VoterDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Exercise6 voter = new Exercise6();
		Map<Integer, Integer> voterMap = new HashMap<>();
		System.out.println("Enter no of voters");
		int size = scanner.nextInt();
		
		for(int i =0;i<size;i++) {
		System.out.println("Enter id of "+(i+1)+" voter");
		voter.setId(scanner.nextInt());
		System.out.println("Enter age of "+(i+1)+" voter");
		voter.setAge(scanner.nextInt());
		
		
		voterMap.put(voter.getId(),voter.getAge());
		}
		
		List<Integer> voterLists = voterList(voterMap);
		System.out.println("List of voters eligible for vote");
		for(int i=0;i<voterLists.size();i++ ) {
			System.out.println(voterLists.get(i));
		}
		
	}

	private static  List<Integer>  voterList(Map<Integer, Integer> voterMap) {

		List<Integer> list = new ArrayList<>();
		for(Map.Entry<Integer,Integer> e : voterMap.entrySet()) {
          //  System.out.println(e.getKey()+":"+e.getValue());
			if(e.getValue()>18) {
				list.add(e.getValue());
			}
        }
		
		return list;
		
	}

}

