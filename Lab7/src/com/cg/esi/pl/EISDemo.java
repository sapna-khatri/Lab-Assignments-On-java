package com.cg.esi.pl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

public class EISDemo {

	static Map<Integer, EmployeeService> employee = new HashMap<>();
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		Employee e1 = new Employee();
		EmployeeService emp = new EmployeeServiceImpl(); 
		System.out.println("Enter no of employee");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
		emp.getEmployeeDetails(e1);
		employee.put(i,emp);
		
		}
		
		for(Map.Entry<Integer,employee> e : hashMap.entrySet()) {
            System.out.println(e.getKey()+":"+e.getValue());
        }
		System.out.println("Insurance Scheme : "+emp.findInsuranceScheme(e1));
		emp.showEmployeeDetails(e1);
	}

}
