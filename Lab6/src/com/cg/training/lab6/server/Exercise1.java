package com.cg.training.lab6.server;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise1 {
	
	public static void main(String args[]) {
		
		Map<Integer,String> hashMap = new HashMap<>();
		
		hashMap.put(1,"Poonam");
		hashMap.put(2,"Pallavi");
		hashMap.put(3,"Shubhangi");
		hashMap.put(4,"Bhagyashri");
		hashMap.put(5,"Pooja");
		hashMap.put(6,"Shilpa");
		
		List<String> l1 = getValue(hashMap);
		System.out.println(l1);
	}
	
	public static List<String> getValue(Map<Integer, String> hashMap){
		List<String> list = new ArrayList<>();
		
		for(Map.Entry<Integer,String> s : hashMap.entrySet()) {
           // System.out.println(s.getKey()+":"+s.getValue());
			list.add(s.getValue());
        }
		
		Collections.sort(list);
		
		return(list);
	}

}
