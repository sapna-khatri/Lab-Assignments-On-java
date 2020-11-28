package com.cg.training.lab6.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.training.lab6.server.Exercise4;

public class StudentDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Map<Integer, Integer> studentMap = new HashMap<>();
		Exercise4 student = new Exercise4();
		System.out.println("Enter no of students");
		int size = scanner.nextInt();
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter id and mark of "+(i+1)+" student");
			student.setId(scanner.nextInt());
			student.setMarks(scanner.nextInt());
			studentMap.put(student.getId(),student.getMarks());
		}
		
		Map<Integer,String> sMap = getStudents(studentMap);
		System.out.println("Student with medals");
		for(Map.Entry<Integer,String> e : sMap.entrySet()) {
            System.out.println(e.getKey()+":"+e.getValue());
        }
	}

	private static Map<Integer, String> getStudents(Map<Integer, Integer> studentMap) {

		Map<Integer,String> smap = new HashMap<>();
		for(Map.Entry<Integer,Integer> e : studentMap.entrySet()) {
           // System.out.println(e.getKey()+":"+e.getValue());
			if(e.getValue()>=90) {
				smap.put(e.getKey(),"Gold");
			}else if(e.getValue()<90 && e.getValue()>=80) {
				smap.put(e.getKey(),"Silver");
			}else if(e.getValue()<80 && e.getValue()>=70) {
				smap.put(e.getKey(),"Bronze");
        }
		
	
	}
		return smap;
 }
}
